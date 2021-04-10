package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakarak
		//isim ve soyisim yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String surname = scan.nextLine();
		
		System.out.println(name+ " "+ surname);
		
		
			

	}

}
