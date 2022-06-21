package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer Cenk=new IndividualCustomer();
		Cenk.customerNumber="160309041"; 
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.customerNumber="99999";
		CustomerManager customerManager=new CustomerManager();
		
		Customer[] customers= {Cenk, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
