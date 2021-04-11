package odev;

import java.util.Scanner;

public class YarimString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir kelime girin");
		String str = scan.next();
		
		if (str.length()%2==0) {
			System.out.println(str.substring(0, str.length()/2));
			
		}else {
			System.out.println(str.substring(0, (str.length()+1)/2));
		}
		scan.close();
	}

}
