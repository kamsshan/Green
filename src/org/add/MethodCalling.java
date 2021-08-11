package org.add;

public class MethodCalling 
{
	static int total;
	static int sum;
	
	public int adding(int x, int y)
	{
		total=x+y;
		
		System.out.println("Addition Value is: " +total);
		
		return total;
		
	}
	public void diving()
	{
		sum=total/2;
		//return sum;

	}
	public static void main(String[] args) 
	{
		MethodCalling m=new MethodCalling();
		m.adding(10, 30);
		m.diving();
		System.out.println("Diving Value is:" +sum);
	
		
	}
}
