package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Internet Subesi";
		double dolarDun=8.15;
		double dolarBugun=8.16;
		int vade=36;
		boolean dolarDustumu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü");
		}
		else if(dolarBugun>dolarDun){
			System.out.println("Dolar yükseldi");
		}
		else {
			System.out.println("Dolar dün ile bugün eşit");
		}
		
		String kredi1="Hızlı Kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="Konut kredisi";
		String kredi4="Çiftçi kredisi";
		String kredi5="Msb kredisi";
		String kredi6="Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür Bakanlığı Kredisi"
			};
		
		for(String kredi:krediler) {  //kredi tagıyla krediler'i gez.
			System.out.println(kredi);
		}
		
	}
}