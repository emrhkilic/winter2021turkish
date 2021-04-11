package odev;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Toplamak  için sayý girin");
 
		int sum =scan.nextInt();
		int count=1;
		while (sum<500) {
			System.out.println("sayý ekleyin");
			int sayi = scan.nextInt();
			count++;
			sum= sum+sayi;
		}
		System.out.println("toplam " + sum + " oldu");
		System.out.println(count + " sayý girdiniz");
		scan.close();
	}

}
