package com.nisha.mevanproject;

public class MethodDemo1 {

	public static void main(String[] args) {
		MethodDemo1 a = new MethodDemo1();
		a.Getdata1();
		System.out.println(a.Getdata2());
		System.out.println(Getdata3());
		
		MethodDemo2.GetDetails2();
		
		MethodDemo2	a1=new MethodDemo2();
		a1.GetDetails1();
	

	}
	public void Getdata1()
	{
		System.out.println("I'm GetData1 from MethodDemo1");
	}
	
	public String Getdata2()
	{
		System.out.println("I'm GetData2 from MethodDemo1");
		return "Im GetData2 from MethodDemo1 ...Awesome";
	}
	public static int Getdata3()
	{
		System.out.println("I'm learning Selenium");
		return 100;	
	}
	
	
	

}
