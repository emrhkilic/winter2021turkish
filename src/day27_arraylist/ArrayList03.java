package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif tam sayý girin");
		int sayi = scan.nextInt();
		
		List<Integer> fibo= new ArrayList<>();
		
		fibo.add(1);
		fibo.add(1);
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		System.out.println(fibo);
	}

}
