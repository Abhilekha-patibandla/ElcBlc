package com.ElcBlc;

public class MainCircle {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(10);
		c.initializeValues(10);
        System.out.println(c.area());
        System.out.println(c.diameter());
        System.out.println(c.circumference());
        System.out.println(c.printDetails());
	}

}
