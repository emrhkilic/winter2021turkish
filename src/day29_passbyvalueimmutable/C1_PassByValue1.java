package day29_passbyvalueimmutable;

public class C1_PassByValue1 {

	public static void main(String[] args) {
		double fiyat = 100;
		
		indirimUygula(fiyat);
		
		System.out.println("method sonrasý fiyat: " + fiyat);
	}

	public static void indirimUygula(double fiyat) {
		fiyat = fiyat*0.9;
		System.out.println("%10 indirimli fiyat: " + fiyat);
		System.out.println(fiyat-10);
	}

}
