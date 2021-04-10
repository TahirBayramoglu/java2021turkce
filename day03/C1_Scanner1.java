package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		//?Kullanicidan isim ve soy ismini isteyp 
		//isim: Mehmet 
		//soyisim: Bulutluöz 
		//kursumuza kaydiniz alinmistir, tesekkur ederiz.
		//seklinde yazdirin
		
		//scanner: Kullanicidan bilgi almak icin kullaniyoruz
		//3 adimda islemi tamamliyoruz
		//1. adim Scanner objesi olusturuyoruz
		//Scanner in calismasi icn Java.util(utilities) kutuphanesinden ilgili kismi class imiza import etmeliyiz.
		
		Scanner scan = new Scanner(System.in);
		
		//2. adim kullaniciya ne istedigimizi belirten bir mesaj yazmaliyiz
		
		System.out.println("lutfen sadece isminizi giriniz");
		String name = scan.nextLine();
				
		System.out.println("Lutfen simdi de soyisminizi giriniz");
		String surname = scan.nextLine();
		
		System.out.println("isim: " + name);
		System.out.println("soyisim: " + surname);
		System.out.println("Kursumuza kaydiniz alinmistir, tesekkur ederiz");

	}

}
