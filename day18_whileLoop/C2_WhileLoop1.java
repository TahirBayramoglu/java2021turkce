package day18_whileLoop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While: suresunce
		//10 dan 30 a kadar olan sayilarda 4 ile bölinebilenler
		//aralarinda bir bosluk olacak sekilde yan yana yazdirin
		
		// once forloop ile yapalim
		
		for (int i = 10; i<=30; i++) {
			if (i%4==0) {
				System.out.print(i+ " ");
			}
		}
		
		//aynisini while loop ile yapalim
		
		int sayi = 10;  //1. sarti gerceklestirdim (baslangic degeri)
		while (sayi<30) { //2. sarti gerceklestirdim (bitis kosulu)
			
			if (sayi%4==0) {
				System.out.print(sayi+ " ");
			
			}
			
		sayi++; //3. sarti gerceklestirdim (degisim degeri)	
		
		}

	}
		
}
