package day03;

public class C5_IncreamentDecreament {

	public static void main(String[] args) {
		int num = 15;
		
		//bi sayiyi 2 artirmak istersek sayisi iki ile toplariz
		//
		
		int num2 = num+2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = "+ num);
		
		num=num+5;//esitligin saginda olusan sonuc num variable ina atanir. bu satirdan sonra
		         //num = 20 dir.
		
		System.out.println("16. satirdan sonra nunm = " + num);
		
		System.out.println(num+12);
		
		//bir sayiyi artirmak istersek o sayiya istedigimiz sayiyi ekler 
	   //ve sonucu variable a atariz
		
		//num'i 8 artir
		
		num = num+8;
		System.out.println(num);
		
		num+= 8;
		System.out.println("javanin pratik artisindan sonra num = "+num);
		
		//num i 10 artiralim
		
		num+= 10; //43
		
		//sadece 1 artirmaya özel olarak java pratik method
		
		num++;//45
		
		System.out.println("num in son hali" +num);

	}
	
	

}
