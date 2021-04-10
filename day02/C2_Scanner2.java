package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		//kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dairenin yaricapini girin:");
		
		double yaricap = scan.nextDouble();
		
		System.out.println("Girdiginiz cemberin capi: "+ 3.14* yaricap*yaricap);
		
	}
	
}
  