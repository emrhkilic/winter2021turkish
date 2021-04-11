package odev;

import java.util.Scanner;

public class CumleKelime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle girin");
		
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.println("Lütfen bir kelime girin");
		
		String kelime = scan.next().toLowerCase();
		
		int a = cumle.indexOf(kelime);
		
		if (a ==-1) {
			
			System.out.println("Kelime cümlede kullanýlmamýþ.");
			
		} else if (a >=0 && cumle.indexOf(kelime, a+1)<= 0) {
			
			System.out.println("Kelime cümlede 1 kere kullanýlmýþ");
			
		} else {
			System.out.println("Kelime cümlede 1'den fazla kullanýlmýþ");
		} 

		scan.close();

	}

}
