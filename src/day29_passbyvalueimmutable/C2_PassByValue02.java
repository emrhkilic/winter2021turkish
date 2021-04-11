package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {

		double fiyat = 100;
		System.out.println("%10 indirimli fiyat: " + indirimUygula10(fiyat));
		System.out.println("%10 indirimli fiyat: " + indirimUygula20(fiyat));
		System.out.println("%10 indirimli fiyat: " + indirimUygula25(fiyat));
		System.out.println("method sonrasý fiyat: "+ fiyat);
		
	}

	private static double indirimUygula25(double fiyat) {
		fiyat*=0.75;
		
		return fiyat;	
		}

	private static double indirimUygula20(double fiyat) {
		fiyat*=0.8;
		return fiyat;	
		}

	private static double indirimUygula10(double fiyat) {
		fiyat*=0.9;
		return fiyat;
	}

}
