package day35_inheritence;

public class Personel {
	public String isim;
	public int sayi;
	public Personel() {
		//super();
		System.out.println("personel paratmetresiz metot �al��t�");
	}
	public Personel(int sayi) {

	}
	public Personel(String isim, int sayi) {
		//super();
		System.out.println("personel parametreli constructor �al��t�");
	}
	
}
