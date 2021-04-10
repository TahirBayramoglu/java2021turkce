package day21_scope;

public class Scope2 {

	
	
	public static void main(String[] args) {
		
		//static variable'lar icin objekt olusturma ihtiyaci yoktur.
		//Baska bir Class'dan static variable'lara ulasmak istedigimizde 
		//Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);  //Java Run Time programdir.
		                                    // Scope2 Class' calistirildiginda Scope1 calismazzzz
		                                   // dolayisiyla en basta olusturulan ve ya atanan degerler gecerli olur

		Scope1.okulAdi = "Mehmet Koleji";
		System.out.println(Scope1.okulAdi); //Mehmet koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
	}

	
	
}
