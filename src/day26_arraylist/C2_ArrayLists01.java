package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayLists01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		List<String> list2=new ArrayList<>();
		list2.add("Ali");
		list2.add("Veli");
		list2.add("Ayşe");
		System.out.println(list2);
		list2.add(2, "Can");
		System.out.println(list2);
		
		
		int  arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=5;
		
		List<Integer> istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
		}
	}

}