package com.abstraction;

import org.omg.Messaging.SyncScopeHelper;

public class InterfacetestC implements InterfacetestA, InterfacetestB{

	public void getcar() {
		System.out.println("BMW");
		
	}

	public void getphone() {
		System.out.println("Iphone");
		
	}

	public void getjob() {
		System.out.println("IT job");
		
	}

	public void getcash() {
	    System.out.println("10000");
		
	}

	public void getbonus() {
		System.out.println("30000");
		
	}
public static void main(String[] args) {
	InterfacetestC obj=new InterfacetestC();
	obj.getbonus();
	obj.getcar();
	obj.getcash();
	obj.getjob();
	obj.getphone();
}
}


