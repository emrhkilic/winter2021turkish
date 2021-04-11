package odev;

import java.util.Scanner;

public class TersString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string girin");
		
		String str = scan.nextLine();
		System.out.println(tersStr(str));
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


