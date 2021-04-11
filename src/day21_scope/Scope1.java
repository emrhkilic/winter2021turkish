package day21_scope;

public class Scope1 {
	
	static int okulId = 1201;
	static String okulAdi= "Yýldýz Koleji";
	static boolean acikMi;

	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);
		okulId=1202;
		acikMi= true;	
		
		staticMethod();
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi);
	}
	
	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdi + " " + acikMi);
		okulId=1203;
	}
	
	public void method() {
		okulId=1205;
	}

}
