 package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri turunde bir degisken olusturup deger atayin
		//olusturulan variable i adim adim AUTO WIDENING ile genisletip yazdirin.
		
		byte numByte = 34;
		
		System.out.println("byte degisken degeri : " + numByte);
		
		//short yapalim
		
		short numShort = numByte;
		
		System.out.println("short degisken degeri : " + numShort);
		
		int numInt = numShort;
		
		System.out.println("integer degisken degeri : " + numInt);
		
		float numFloat = numInt;
		
		System.out.println("Float degisken degeri : " + numFloat);
		
		double numDouble = numFloat;
		
		System.out.println("Double degisken degeri : "+ numDouble);

	}

}
