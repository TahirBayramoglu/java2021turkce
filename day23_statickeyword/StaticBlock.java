package day23_statickeyword;

public class StaticBlock {

	
	static String isim;
	//static block class calistirildiginda ilk olarak calisir (main method'dan bile önce calisir)
	//class calisinca ilk calisacak olan sey
	//static block'lar static variable'lara deger atamak icin kullanilir 
	
	
	static {
		
		System.out.println("2. static block calisti");
	}
	
	
	static {
		
		isim = "Tahir";
		System.out.println(isim);
	}
	

	public static void main(String[] args) {
		
		isim = "Alican";
		System.out.println(isim);

	}

}
