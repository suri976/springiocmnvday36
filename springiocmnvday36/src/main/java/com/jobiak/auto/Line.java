package com.jobiak.auto;

public class Line {

	private Point a;
	private Point b;
	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Line() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Line [a=" + a + ", b=" + b + "]";
	}
	public void draw()
	{
		System.out.println(a+"..."+b);
	}
	
	
	
}
