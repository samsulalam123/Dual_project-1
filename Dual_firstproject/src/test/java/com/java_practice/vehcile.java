package com.java_practice;

public class vehcile {

	static String name;
	int price;
	String color;
	
	public void getcar() {
		name= "bmw";
		price= 50000;
		color= "black";
		String model= "mdx";
		
		System.out.println("model,"+model);
		System.out.println("make=" +name+ "cost="+ "price=" +price);
	}
	
	public static void getsell() {
	name= "toyota";
	System.out.println("make:" +name);
	}
     public static void main(String[] args) {
		
    vehcile obj=new vehcile();
	 obj.getcar();
	 vehcile.getsell();
}	
}