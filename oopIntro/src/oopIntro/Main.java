package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product();
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";
		
		Product product2=new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=13000;
		product2.detail="32 GB Ram";
		
		Product product3=new Product(3,"Rampage Red Sky",20000,"32 GB Ram");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("Ürün Sayısı:" + products.length);
		
		for(Product a:products) {    // a tagıyla products'ları gez
			System.out.println(a.name);
		}
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Beyaz Eşya");
		
		Category category2=new Category();
		category2.setId(2);                              // SET YAZMA
		category2.setName("Yiyecek, İçecek");
		
		System.out.println(category1.getName());         // GET OKUMA
		System.out.println(category2.getName());
		System.out.println(category1.getId());
		System.out.println(category2.getId());
		

	}

}
