package day23_statickeyword;

public class Static1 {
	
	static String isim ="Mehmet";
	int yas = 49;

	public static void main(String[] args) {
		
		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
		Static1 st3 = new Static1();
		
		st1.isim="Hasan";
		st1.yas=25;
		st2.isim="Ay�e";
		st2.yas=30;
		st3.isim="Alican";
		st3.yas=40;
	}

}
