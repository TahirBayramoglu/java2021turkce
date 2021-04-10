package day20_scope;

import java.io.InputStream;
import java.util.Scanner;

public class Scope1 {

	
   int sayi; // class in icinde fakat main metod un disinda olusturulan
              // ve static olmayan variable lara INSTANCE (Objekt) variable denir.
             // Class level'da olsuturuldugu icin class in her yerinden belli sartlarla kullanilabilir.
             // Instance variable'lar object'e bagli olarak calisir (ögretmen adi veya, ögrenci notu gibi)
    
    public String isim = "Mehmet"; // default 0
    public String soyisim;        //default deger null
    public boolean izindeMi;     //default deger false
    public char ilkHarf;        // default deger hiclik 
	public Scope1(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public Scope1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
           //System.out.println(sayi); //static olmayan bir variable'a static method icinden ulasamayiz
		                         // main method'umuz static oldugu icin main method icerisinden, static olmayan 
		  // method();                      // variable ve ya method lara direk ulasamayiz
          // instance bir variable'a main method icerisinden ulasmak istedigimizde
		  // - OBJEKT -   olusturmaliyiz. 
		
		Scanner     scan =             new                  Scanner       (System.in); //bu javadaki standart obje olusturma formudur 
   //  class ismi   obje ismi   obje olsuturmada keyword    class ismi     Parametre	
	
		Scope1 obj1 = new Scope1(System.in);
		System.out.println(obj1.sayi);//buna deger atamadik java default deger verdi 0
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim); //buna deger atamadik 
		// instance variable lar olusturuldugunda biz istersek deger atayabiliriz
		// Instabce variable'laraeger biz deger atamazsak Java Default deger atar
		
		Scope1 obj2 = new Scope1();
		obj2.isim= "Muslum";
		obj2.soyisim="Baba";
		
		System.out.println(obj2.isim+" "+obj2.soyisim);//Muslum Baba
		System.out.println(obj1.isim+" "+obj1.soyisim);//Mehmet null
		
		System.out.println(obj2.izindeMi);
        System.out.println(obj2.ilkHarf);
        
        Scope1 obj3 = new Scope1();
        obj3.isim = "Walter";
        obj3.soyisim = "White";
        obj3.izindeMi = true;
        System.out.println(obj3.isim+ " "+ obj3.soyisim+ " "+ obj3.izindeMi+ " ");
        
        scan.close();
	}

	public static void staticMethod1() {
		
	}
	
	public void method() {
		
		System.out.println(sayi); // bu method static olmadigi icin intance variable'lara direk erisebilir
		
		sayi = sayi+20; // bu method icerisinde gecerli olmak uzere degerini degistirebilir
		
		
	}
}
