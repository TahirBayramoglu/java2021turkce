package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {

		// 3 adimda scanner islemini gerceklesiriyoruz

		// 1. adim Scanner olusturacagiz

		Scanner scan = new Scanner(System.in);

		// new : Java da ne zaman new kelimesini görseniz yeni bir
		// objekt olusturuluyor demektir.

		// java.util java nin bizim icin hazirladigi bir kutuphanedir. ihtiyacimiz
		// oldugunda ihtiyacimiz olan kodlari class a import etmemiz yeterlidir.

		// 2. adim kullaniciya bir mesaj yazin

		System.out.println("Karenin bir keanr uzunlugunu girin");

		// 3. adim kullanicinin konsola girdigi degeri programimiza alacagiz ve bir
		// variable olusturup bu degeri atayacagiz
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayi da
		// girebilir, buyuk bir sayi da yazabilir, tam sayi da yazabilir,
		// virgullu sayi da yazabilir

		double kenar = scan.nextDouble();

		System.out.println("Girdiginiz kenar uzunluguna sahip karenin alani " + kenar * kenar);

	}

}
