package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 ic ice try-catch yerine 
		 1 tane try ve multiple catch blogu kullanabiliriz
		 Ancak bu durumda yazdigimiz exceptionlar arasinda parent-Child iliskisi varsa
		 Önce child class i yazmaliyiz
		 Aksi takdirde (yani önce parent yazilirsa) child'a is kalmaz
		 Java erisilemez catch-blogu diyerek CTE verir.
		 
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
