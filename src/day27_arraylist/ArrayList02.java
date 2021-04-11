package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		List<String> list= new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayşe");
		list.add("Fatma");
		System.out.println(list);
		
		list.set(2, "Kemal");
		System.out.println(list);
		
		list.add(2, "Yasin");
		System.out.println(list);
		
		list.add(list.size(), "Semih");
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);

		

		
		
	}

}
