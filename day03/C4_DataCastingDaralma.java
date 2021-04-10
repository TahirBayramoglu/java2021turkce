package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		//double bir deger olusturalim ve bunu int ve sonra da
		//byte a cevirin
		
		double numDouble = 15;
		
		int numInt = (int)numDouble;
		
		System.out.println("integer degisken degeri : " + numInt);

		byte numByte = (byte)numInt;
		
		System.out.println("byte integer degeri : " + numByte);
	}

}
