package odev;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen toplamak için pozitif sayı girin. Çıkmak için 0'a basın");
		int sayi =scan.nextInt();
		int sum= sayi;
		int countP=1;
		int countN=0;
		while (sayi!=0) {
			System.out.println("Pozitif sayı ekleyin");
			sayi= scan.nextInt();
			if (sayi>0) {
				sum= sayi+sum;
				countP++;
			} else if(sayi<0){
				System.out.println("Negatif sayi giremezsiniz");
				countN++;
			} else {
				break;
			}
			
		}
		System.out.println("Toplam= " + sum);
		System.out.println(countP + " adet pozitif sayı girdiniz");
		System.out.println(countN + " adet negatif sayı girdiniz");
		scan.close();
	}

}
