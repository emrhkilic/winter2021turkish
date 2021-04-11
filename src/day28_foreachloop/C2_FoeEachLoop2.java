package day28_foreachloop;

public class C2_FoeEachLoop2 {

	public static void main(String[] args) {
			int arr[] = {1,2,1,2,4,3,1,2};
			
			int product = 1;
			
			for (int each : arr) {
				product*= each;
			}
			
			System.out.println("çarpým= " + product);
	}

}
