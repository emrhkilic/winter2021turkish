package odev;

import java.util.Scanner;

public class Piramit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý girin");
		int i = scan.nextInt();
		for (int j = 0; j <i ; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scan.close();
	}

}
