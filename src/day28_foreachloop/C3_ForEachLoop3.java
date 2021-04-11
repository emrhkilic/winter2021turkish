package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {

		String arr[]= {"Ali","Veli","Ayse","Fatma"};
		
		List<String> list = listeyeCevir(arr);
		
		list.add(0, "Bu iþ bu kadar");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		
	}

	private static List<String> listeyeCevir(String[] arr) {
		
		List<String> geciciList = new ArrayList<>();
		
		for (String each : arr) {
			
			geciciList.add(each);
		}
		
		return geciciList;
	}

}
