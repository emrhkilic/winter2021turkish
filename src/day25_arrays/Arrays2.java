package day25_arrays;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
	
		int arr[]= {10,25,3,16,75};
		
		int sayi= 25;
		
		boolean flag= false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
			}
			
		}
		System.out.println(flag==true ? "var" : "yok");
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, sayi));
	}

}
