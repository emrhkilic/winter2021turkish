package odev;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen toplamak i�in pozitif say� girin. ��kmak i�in 0'a bas�n");
		int sayi =scan.nextInt();
		int sum= sayi;
		int countP=1;
		int countN=0;
		while (sayi!=0) {
			System.out.println("Pozitif say� ekleyin");
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
		System.out.println(countP + " adet pozitif say� girdiniz");
		System.out.println(countN + " adet negatif say� girdiniz");
		scan.close();
	}

}
