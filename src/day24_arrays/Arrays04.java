package day24_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			System.out.print(arr[i]+" ");
			
		}

		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i]= arr[arr.length-1-i];
		}
	}

}
