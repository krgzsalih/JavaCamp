package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer ahmet = new IndividualCustomer();
		ahmet.customerNumber = "1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "57878";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer [] customers = {ahmet, hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}

// SOLID - Open Closed princible = Yeni bir gelen kuralda, backend ve programda herhangi bir deðiþiklik yapýlmamasý lazým (polimorfizim)