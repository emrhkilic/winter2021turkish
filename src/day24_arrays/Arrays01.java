package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2=20;
		int sayi3=30;
		String isim ="Ali";
		
		int arr[]= {10,20,30};
		
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		String takim[]= new String[3];
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim));
		System.out.println(takim.length);
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		

		

	}

}
