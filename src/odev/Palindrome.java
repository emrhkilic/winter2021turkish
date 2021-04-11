package odev;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir string girin");
		String str = scan.nextLine();
		if (str.equalsIgnoreCase(tersStr(str)) ) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Palindrome değil");
		}
		scan.close();
	}
	
	public static String tersStr(String str) {
		String ters ="";
		for (int i =str.length()-1 ; i >=0; i--) {
			
			ters += str.substring(i, i+1); 			
		}
		return ters;
	}

}
