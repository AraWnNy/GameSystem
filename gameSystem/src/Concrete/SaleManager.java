package Concrete;

import Abstract.SaleService;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService{

	@Override
	public void sale(Customer customer, Game[] games) {
		double totalPrice = 0;
		for(Game game : games) {
			totalPrice+=game.getSalesPrice();
		}
		
		System.out.println("Oyunlar�n toplam tutar� : " + totalPrice);
		System.out.println("Sat�n al�nan hesap : " + customer.getFirstName() + " " + customer.getLastName());
	}
	
}
