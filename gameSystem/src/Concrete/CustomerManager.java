package Concrete;

import Abstract.CustomerService;
import Entities.Customer;
import Abstract.CustomerCheckService;

public class CustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void add(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("M��teri eklendi : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullan�c� do�rulama hatas�...");
		}
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi :" + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " + customer.getFirstName());
		
	}

}
