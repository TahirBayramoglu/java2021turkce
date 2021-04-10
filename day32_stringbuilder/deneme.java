package day32_stringbuilder;

public class deneme {

	public static void main( String[] args) {
		new deneme() .deneme(1,"hello");
		new deneme() .deneme(2, "hello", "hi");
		
	}
	
	public void deneme (int x, String...y) {
		
		System.out.println(y[y.length-x]+ "  ");
	}

}
