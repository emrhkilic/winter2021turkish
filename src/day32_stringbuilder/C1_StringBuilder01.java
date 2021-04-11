package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Emrah");
		System.out.println(sb1);
		
		sb1.append(" ").append("K�l��");
		System.out.println(sb1);
		
		String cumle = "Javayi �ok sever";
		sb1.append(cumle, 6, 10);
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.charAt(3));
		sb1.delete(12, 15);
		System.out.println(sb1);
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		
		String isim = "Emrah K�l��";
		System.out.println(sb1.equals(isim));
		
		StringBuilder sb2 = new StringBuilder("Emrah K�l��");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.capacity());
		
		
	}

}
