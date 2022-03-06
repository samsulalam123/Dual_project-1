package com.polymorphism;

public class testoverriding extends Methodoverriding1{
        public void getbusiness() {
        	System.out.println("I have my own business");
        }
        public void getcar() {
        	System.out.println("I have Toyota");
        	
        }
        
        public void getwife() {
        	System.out.println("I love Karina");
        }
        
        public static void main(String[] args) {
			testoverriding obj=new testoverriding();
			obj.getcash();
			obj.getgold();			
			obj.getproperty();
			obj.getwife();
			
			obj.getbusiness();
			obj.getcar();
		}
}
