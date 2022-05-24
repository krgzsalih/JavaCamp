package inheritance;

import java.util.Iterator;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	
	//bulk insert = toplu g�nderme
	public void addMultiple (Customer[] customers) {
		for (Customer customer: customers) {
			add(customer);
		}
	}
}
