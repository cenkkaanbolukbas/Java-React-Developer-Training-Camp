package inheritance;

public class CustomerManager {
	public void add(Customer customer) {              //FONKSİYON - METHOD
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	
	//bulk insert - çoklu müşteri ekleme
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
	}

}
