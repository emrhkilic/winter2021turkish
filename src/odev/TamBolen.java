package odev;

import java.util.Scanner;

public class TamBolen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam sayý girin");
		
		int i = scan.nextInt();
		int count =0;
		for (int j = 1; j <= i; j++) {
			if (i%j==0) {
				System.out.print(j + " ");
				count++;
				
			}
		}
		System.out.println("Toplam " + count + " adettir");
		scan.close();
	}

}
