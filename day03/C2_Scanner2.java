package day03;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		//? Kullanicidan ismini isteyp bir harfini buyuk harf olarak yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi girin");
		
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Isminizin ilk harfi:" + ilkHarf);

	}

}
