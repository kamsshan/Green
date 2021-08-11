package org.add;

public class AccessSpecifiers 
{
	protected AccessSpecifiers()
	{
		System.out.println("Default Constructor");
	}
	protected static void one()
	{
		System.out.println("One");
	}
	protected static void two()
	{
		System.out.println("Two");
	}
//	public static void main(String[] args) 
//	{
//		AccessSpecifiers.one();
//		AccessSpecifiers.two();
//		
//	//AccessSpecifiers ac=new AccessSpecifiers();
//	
//	
//	}
	
}
