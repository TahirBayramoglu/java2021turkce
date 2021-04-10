package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		 // Java ya bir dosyayi okumasini ve ya dosyayay yazmasini söyledigimizde
	    //Java "ya dosyayi bulamazsam"  der ve bizden cözum uretmemizi bekler
	   //Dosya bulma ile ilgili exception turu: FileNotException
	  // Java kodu yazar yazamaz buradaki olasi problemi görur ve CTE verir
	 // Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Exceptions denir
	// 	

		try {
			FileInputStream fis =  new FileInputStream("/Users/bayramoglu/eclipse-workspace/winter2021turkish/src/day39_exceptions/File");
		
			
		
		} catch (FileNotFoundException e) {
			
			

			
			e.printStackTrace();//tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
		}
		
		System.out.println("Kod bloke olmamisss");

		
	}

}
