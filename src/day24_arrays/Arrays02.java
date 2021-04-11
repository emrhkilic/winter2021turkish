package day24_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays02 {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6};
		
		int temp=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
		}
		 System.out.println(sum);
		 
		 for (int i = 0; i < arr.length; i++) {
			 
			 System.out.print(arr[i] +" ");
			
		}
	}

}
