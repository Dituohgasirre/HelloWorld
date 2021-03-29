package qingke1;

public class Circle {
	 private double  radius=1.0;
	private String color="red";
   // public final static  double pi=3.14;
	public Circle(){
		
	}
	public Circle(double r){
		radius =r;
	}
	public Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public double getRadius(){
		return radius; 
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public String toString(){
		return "Circle[radius="+radius+",color="+color+"]";
		
	}
	

	

}
