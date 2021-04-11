package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk) {
		
	}
	
	public Otomobil() {
		
	}
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public void yakit(String yakit) {
		System.out.println("Araba yakýt olarak " + yakit + " kullanýr");
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}
}
