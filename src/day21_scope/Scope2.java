package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);
		
		Scope1.okulAdi= "Mehmet Koleji";
		System.out.println(Scope1.okulAdi);
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);

	}

}
