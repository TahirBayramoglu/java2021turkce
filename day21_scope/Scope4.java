package day21_scope;

public class Scope4 {

	
	public static void main(String[] args) {
		
		int sayi = 10;
		//bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		//System.out.println(isim);
		
		int sayi2; //bir local variable deger atanmadan da olusturulabilir
		//System.out.println(sayi2); //2- ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
		
		//sayi2++; //2- Ilk deger atanmadigi icin artirma ya da azaltma da yapmayiz
		//java deger atamasi olmadan local variable olusturulmasina izin verir, ilerde deger atanacak diye beklemez
		
		sayi2 =15; //2- olusturma ayri satirda(12.satir), deger atamasi ayri satirda (18 satir) yapilabilir
		
		//3- Birden fazla methodun oldugu Class larda her method'da kullanmamiz gereken 
		//3- ortak variable'lar varsa variable olusturmaliyim
		//3- ortak variable class'in yapisina bagli olarak instance ve ya static olabilir
		
	}

	public static void staticMethod() {
		
		String isim = "Hasan";
		//1- System.out.println(sayi); //bu kuralal main method icerisinde oluturulan variable'lar da dahildir
	}
	
	public void method() {
		boolean isTrue = true;
	    //1- System.out.println(sayi); Bu kural static olan veya olmayan tum methodlar icin gecerlidir
	}
	
}
