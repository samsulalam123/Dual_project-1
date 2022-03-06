package com.abstraction;

public class abstractionB extends abstractionA{

	@Override
	public void getsalary() {
		
		System.out.println("My salary is $100000");
	}
	
	public static void main(String[] args) {
		abstractionB obj=new abstractionB();
	    obj.getsalary();
	    obj.gethouse();
	    obj.getmoney();
		}

}


