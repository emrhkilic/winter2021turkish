package day35_inheritence;

public class Personel {
	public String isim;
	public int sayi;
	public Personel() {
		//super();
		System.out.println("personel paratmetresiz metot çalýþtý");
	}
	public Personel(int sayi) {

	}
	public Personel(String isim, int sayi) {
		//super();
		System.out.println("personel parametreli constructor çalýþtý");
	}
	
}
