package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		
		/*
		 Eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa
		 ic ice try-catch bloklari olusturabilriz
		 
		 Bu örnekte ilk önce dosyayi okutmak istedik
		 java "Ya dosyayi bulamazsam?" diye bizden yardim istedi
		 Biz de try-catch blogu ile FileNotFoundException ile handle etmesine yardimci olduk
		 Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "ya dosyayi okuyamazsam"  diye
		 yardim istedi
		 Bizde try-catch blogu ile IOException ile handle etmesini sagladik 
		 
		 */
		try {
			FileInputStream fis =  new FileInputStream("/Users/bayramoglu/eclipse-workspace/winter2021turkish/src/day39_exceptions/File");
		 int k = 0;
		 try {
			while((k=fis.read())!=-1) {
				 System.out.print((char)k);
				 
			 }
		} catch (IOException e) { // dosyalarla ilgili genele yazma ve okuma sorunlari ile handle eder
			

			e.printStackTrace();
		}
		
		} catch (FileNotFoundException e) {

			
			e.printStackTrace();//tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
		}
		System.out.println(" ");
		System.out.println("Kod bloke olmamisss");

	}

	}

