package com.ElcBlc;

public class Circle {
	
	private double radius;
	private double pi=Math.PI;
	
	public void setRadius(double r) {
		radius=r;
	}
	
	public double getRadius() {
		return radius;
	}
	public void initializeValues(int a) {
		radius=a;
	}
	public double area(){
		return pi*radius*radius;
	}
	public double diameter() {
		return 2*radius;
	}
	public double circumference() {
		return 2*pi*radius;
	}
	public String printDetails() {
		return "Radius:"+radius+" "+"Area:"+area()+" "+"Diameter:"+diameter()+" "+"Circumference:"+circumference();
		
	}
}
