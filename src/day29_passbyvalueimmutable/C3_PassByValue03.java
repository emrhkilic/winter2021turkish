package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		
		degistirFor(list);
		degistirSet(list);
		System.out.println("main metodunun içindeki liste: " + list);
		
		
	}

	private static void degistirSet(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println("metodun içindeki liste: " + list);
	}

	public static void degistirFor(List<Integer> list) {
		for (Integer each : list) {
			each+=3;
			System.out.print((each)+" ");
		}
		System.out.println("");
		System.out.println(list);
	}

}
