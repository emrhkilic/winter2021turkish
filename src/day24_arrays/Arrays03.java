package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lütfen uzunluk girin");
		
		int uzunluk = scan.nextInt();
		
		int arr[] = new int[uzunluk];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Sayý girin");
			arr[i] = scan.nextInt();
			
		} 
		System.out.println(Arrays.toString(arr));

	}

}
