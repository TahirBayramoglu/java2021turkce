package day22_constructor;

public class ParametreliConstructor {

	
	
	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    
    public ParametreliConstructor(int yil) {
    	
    }
    
    public ParametreliConstructor() {
    	
    }
    
    public ParametreliConstructor(String Marka, String Model) {
    	
    }
    
    public ParametreliConstructor(String marka, String model, int yil, boolean kazasiVarMi) {
    	
    }
    
    public void yakit(String yakit) { // method
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) { // method
        System.out.println("Araba " + vites + " viteslidir");
    }
}
