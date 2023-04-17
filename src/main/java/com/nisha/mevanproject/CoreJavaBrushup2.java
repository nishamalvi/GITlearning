package com.nisha.mevanproject;

import java.util.ArrayList;
import java.util.Arrays;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		int[] ary = {1,2,3,4,5,6,88,100,140,153,165};
		
		for(int i=0; i<ary.length; i++)
		{
			if(ary[i]%2==0)
			{
				System.out.println(ary[i]);
				break;                   // it will break the loop once it get the even number/multiple of 2.
			}
			else 
			{
				System.out.println(ary[i]+" is odd number");
			}
			
		}
		//Arraylist concept
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Sanjay");
		a.add("Nisha");
		a.add("Kanish");
		a.add("Dhiyon");
		//a.remove(1);
		
		System.out.println(a.get(1));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		for(String s :a)
		{
			System.out.println(s);
		}
		System.out.println(a.contains("Sanjay"));
		
		// converting normal array into arraylist. For this there is a class called arrays in java.
		String[] name= {"Sanjay","Nisha","Kanish","Dhiyon"};
               java.util.List<String> nameArrayList = Arrays.asList(name);
              System.out.println (nameArrayList.contains("Dhiyon"));
               
	}

}
