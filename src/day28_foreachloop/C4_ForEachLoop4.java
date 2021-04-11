package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		
		String arr1[] = {"Ali","Can","Ayse","Seher"};
		String arr2[] = {"Ali","Veli","Mesut","Seher","Sedat"};
		
		List<String> list = new ArrayList<>();
		int count = 0; 
		for (String each1 : arr1) {
			
			for (String each2 : arr2) {
				
				if (each1.equalsIgnoreCase(each2)) {
					list.add(each1);
					count++;
				}
			}
		}
		if (count==0) {
			System.out.println("Ortak eleman yok");
		} else {
			System.out.println(list);
		}
		
		
		
		}
	}

