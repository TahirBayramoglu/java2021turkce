package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		// verilen 3 double sayinin ortalamasini yazdiran bir metod yazin
		// main method icinden gagirarak method u calistirin

		ortalama(85.2, 90.3,60.50, 64.2); // method call

	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2) / 2);

	}
	
	public static void ortalama(double sayi1, double sayi2, double sayi3, double sayi4) {

		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1 + sayi2+ sayi3 + sayi4) / 4);
		
		
		//burda hangisinin parametreleri uygunsa ona göre bir tanesini secer ve ordan yazdirir. 
	}
}
