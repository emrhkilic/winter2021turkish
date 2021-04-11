package odev;

import java.util.Scanner;

public class Sifre {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Þifre girin");
		
		String sifre = scan.next();
		boolean flag1 = false;
		boolean flag2 = false; 
		boolean flag3 = false;	
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z') {
				flag1= true;
			} else if (sifre.charAt(i)>='a'&& sifre.charAt(i)<='z') {
				flag2 = true;
			} else if (sifre.charAt(i)>='#'&& sifre.charAt(i)<='.') {
				flag3= true;
			}
		}
		boolean flag =(flag1&&flag2)&&flag3;
		System.out.println(flag? "Þifre geçerli": "Þifre geçersiz");
		scan.close();
		}
		
	}


