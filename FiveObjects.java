/* Program for If I create 5 objects of class it should print 5 objects created 
Name:Bhargavi Patnana
ID:844538
07-01-2020*/





package com.cog;

public class FiveObjects {
	public FiveObjects() {
		System.out.println("Objects Created");
	}
	
	String name = "Bhargavi";/*initialization of class members*/
	int id = 12;
	
	public static void main(String[] args) {
		FiveObjects o1 = new FiveObjects();/*creation of objects*/
		FiveObjects o2 = new FiveObjects();
		FiveObjects o3 = new FiveObjects();
		FiveObjects o4 = new FiveObjects();
		FiveObjects o5 = new FiveObjects();
		
		System.out.println(o1.id);/*printing object1 id and name*/
		System.out.println(o1.name);
		
		System.out.println(o2.id);
		System.out.println(o2.name);
		
		System.out.println(o3.id);
		System.out.println(o3.name);
		
		System.out.println(o4.id);
		System.out.println(o4.name);
		
		System.out.println(o5.id);
		System.out.println(o5.name);

	}

}
