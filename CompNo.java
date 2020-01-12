package com.org;

//Biggest and Smallest Number 
//Without using comparison operator
public class Question1 {

	public static void main(String[] args) {
		
		int firstNo = 12, secondNo = 10;
		
		int biggest = ((firstNo+secondNo) + Math.abs(firstNo-secondNo))/2;
		System.out.println("Biggest Number is "+biggest);
		
		int smallest = ((firstNo+secondNo) - Math.abs(firstNo-secondNo))/2;
		System.out.println("Smallest number is "+smallest);

	}

}
