package com.nisha.mevanproject;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		int num = 10;
		String website = "https://www.google.com/";
		char character = 'N';
		double decimal = 12.33;
		float num1 = 4348;
		boolean que = true;
		//datetime time = 11:04;
		
		System.out.println(num);
		System.out.println(que+" is the correct answer");
		//Array concept
		int [] ary= new int[4];
		ary[0]= 2;
		ary[1]= 4;
		ary[2]= 6;
		ary[3]= 8;
		
		System.out.println(ary[3]);
		
		int[] ary2= {3,6,9,12,15};
		String[] name= {"Sanjay","Nisha","Kanish","Dhiyon"};
		
		System.out.println(ary2[1]);
		
		//For loop 
		for(int i=0; i<ary2.length; i++) 
		{
			System.out.println(ary2[i]);
		}
		for( int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		//enhanced for loop
		
		for(String s :name)
		{
			System.out.println(s);
		}
	
		

	}

}
