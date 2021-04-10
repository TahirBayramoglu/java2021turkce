package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {

		toplama('a','b');//
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Integer method sonucu: " + (sayi1 + sayi2));

	}

	public static void toplama(double  sayi1, double sayi2) {
		System.out.println("Double method sonucu: "+ (sayi1+sayi2)); 
			
		}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("Integer/double method sonucu: " + (sayi1 + sayi2));

		}

	public static void toplama(char char1, char char2) {
			System.out.println("Char method sonucu: "+ (char1+char2));
				
			}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu: " + (str1 + str2));
		{

		}
	}

}
