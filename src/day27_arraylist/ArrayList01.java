package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		List<String> list= new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay?e");
		list.add("Fatma");
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.remove(1));
		
		System.out.println(list);
		
		System.out.println(list.remove("Ay?e"));
		System.out.println(list);
		System.out.println(list.remove("Mehmet"));
	
		
		
		
		
	}

}
