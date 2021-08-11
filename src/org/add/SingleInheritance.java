package org.add;

public class SingleInheritance extends SingleInhe
{
	@Override
	public void one() 
	{
		System.out.println("500");
		super.one();
	}
	@Override
	public void two() 
	{
	System.out.println("600");
	super.two();
	}
	public void Four()
	{
		System.out.println("Four");
	}
	
public static void main(String[] args) 
{
	//SingleInheritance s=new SingleInheritance();
	//s.one();
//	s.two();
	SingleInhe ss=new SingleInheritance();
	ss.one();
	ss.two();
	ss.three();
	
}
}
