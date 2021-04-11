package day33_encapsulation;


import day21_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		Scope6 obj1 = new Scope6();
		obj1.num1=10;
		System.out.println(obj1.num1);
		
		obj1.add();
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
		
	}
		
	public void deneme() {
		
		Scope1 obj2 = new Scope1();
		obj2.method();
	}	
	
}
