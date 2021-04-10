package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		/*
		 eger handle edilecek exceptionlar arasinda parent-child iliskisi varsa
		 bu durumda child exception icin catch blogu yazmazsak da kodumuz calisir
		 Child exception'i silmenin 
		 pozitif yani : tek catch blogu ile tum exceptionlar handle edilebilir
		 negatif yönu : bir sorunla karsilastigimizda bunun dosya bulunamadigi icin mi yoksa dosya okunamadigi icin mi oldugunuz bilemeyiz
		 */

		try {
			FileInputStream fis =  new FileInputStream("/Users/bayramoglu/eclipse-workspace/winter2021turkish/src/day39_exceptions/File");
		 int k = 0;
		 try {
			while((k=fis.read())!=-1) {
				 System.out.print((char)k);
				 
			 }
		} catch (IOException e) { //önce child exception'u yazdik

			e.printStackTrace();
		}
		
		} catch (FileNotFoundException e) { // sonra parent exception

			System.out.println(e.getMessage());
			
	
		}
		System.out.println(" ");
		System.out.println("Kod bloke olmamisss");
	
	}

}
