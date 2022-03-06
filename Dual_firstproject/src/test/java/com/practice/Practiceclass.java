package com.practice;

public class Practiceclass {
static int num;
String name;

	public static void getcar() {
	num =10;
	System.out.println(num);
	
	}
	public void gethouse() {
		name="Alam";
		num =10;
		int A=15;
		String B="Faruk";
		System.out.println(name);
	}
	public void getname() {
		name="Sadia";
		System.out.println(name);
	}
	
	public static void getnum() {
		num=100;
		System.out.println(num);
	}
	public static void main(String[] args) {
		Practiceclass obj=new Practiceclass();
		obj.gethouse();
		Practiceclass.getcar();
		Practiceclass.getnum();
		obj.getname();
		
		
	}
	
}


