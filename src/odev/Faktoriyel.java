package odev;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("50'den küçük bir sayı girin");
		
		int i = scan.nextInt();
		System.out.println(i+"!= " + faktoriyel(i));		
		scan.close();

	}
	
	public static int faktoriyel(int k) {
		int f=1;
		for (int i = k; i >=1; i--) {
			f*=i;
		}
		return f;
	}

}
