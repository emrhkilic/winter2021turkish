package day22_constructor;

public class CarUret {
	
	public CarUret(){
		
	}
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	
	public void yakit(String yakit) {
		System.out.println("Araba yak�t olarak " + yakit + " kullan�r");
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
