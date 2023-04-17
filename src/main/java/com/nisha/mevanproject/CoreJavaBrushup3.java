package com.nisha.mevanproject;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		String s1= "Sanjay";
		String s2= "Sanjay";
		String s3= "Nisha";
		
		String s4=new String("Kanish");
		String s5=new String("Kanish");
		String s6=new String("Dhiyon");
		
		String s = "Nisha Sanjay Malvi";
		String[] arrayS =s.split("Sanjay");
		System.out.println(arrayS[0]);
		System.out.println(arrayS[1]);
		//System.out.println(arrayS[2]);
		System.out.println(arrayS[1].trim());
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for(int i= s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}

	}

}
