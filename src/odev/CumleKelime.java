package odev;

import java.util.Scanner;

public class CumleKelime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle girin");
		
		String cumle = scan.nextLine().toLowerCase();
		
		System.out.println("L�tfen bir kelime girin");
		
		String kelime = scan.next().toLowerCase();
		
		int a = cumle.indexOf(kelime);
		
		if (a ==-1) {
			
			System.out.println("Kelime c�mlede kullan�lmam��.");
			
		} else if (a >=0 && cumle.indexOf(kelime, a+1)<= 0) {
			
			System.out.println("Kelime c�mlede 1 kere kullan�lm��");
			
		} else {
			System.out.println("Kelime c�mlede 1'den fazla kullan�lm��");
		} 

		scan.close();

	}

}
