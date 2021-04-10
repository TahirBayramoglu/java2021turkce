package day01;

public class C2_Variables {
	
	public static void main (String[] args) {
	
		int sayi; //; yazim dilindeki . gibidir. java ; 'u görunce o satirdaki kod yazziliminin bittigini anlar
		 sayi = 27;
		 
		 System.out.println(sayi); //eger println degil de print yazarsak yazdirma isleminden sonra alt satira gecmez 
		 
		 char ilkHarf='M';
		 System.out.println(ilkHarf); // M
		 
		 double sayiDouble = 5.34;
		 System.out.println(sayiDouble); //5.34
		 
		 System.out.println(sayi + sayiDouble); //
		 
		 System.out.println(sayi + ilkHarf );  //ASCI kodlarindanki degerlerinden öturu sonuc 104 oldu 
		                                      //Eger bir toplama isleminde char degisken kullanilirsa karakterin 
		                                     //ASCi kodundaki degerleri toplanmis oluyor. 
		 
		 
		 
	}

}
