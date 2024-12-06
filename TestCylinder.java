import java.util.*;
public class TestCylinder{

	public static void main(String args[]){

	Cylinder cyl = new Cylinder();
	Scanner scn = new Scanner (System.in);
	
	System.out.println("\nEnter Radius to Calculate :");
	double rad = scn.nextDouble();
	cyl.setRadius(rad);
	
	System.out.println("Enter Height to Calculate :");
	double hei = scn.nextDouble();
	cyl.setHeight(hei);
	
	cyl.displayinfo();

	Cylinder cyl_2 = new Cylinder(rad);
	Cylinder cyl_3 = new Cylinder(hei,rad);
	
	cyl_2.displayinfo();
	cyl_3.displayinfo();
	
	
	}
	
}	
	
	
	
	
class Cylinder{


	private double radius ;
	private double height ;
	
	//Constructors	
	public Cylinder(){
	this.radius = 1;	
	System.out.printf("No Arguments Constructor");
		
	}
	
	public Cylinder(double height){
	this.radius = 1;	
	this.height = height;
		
	}

	public Cylinder(double height, double radius){
	
	this(height);
	this.radius = 1;	
		
	}
	
	//Setters	
	public void setHeight(double height){
		this.height = height;
	
	}
	public void setRadius(double Radius){
		this.radius= Radius;
	
	}
	
	//Getters
	public double getHeight(){
		
	return height;
	}
	public double getRadius(){
		
	return radius;
	}
	
	
	public double calculateArea(){
		return (2*3.14*height*radius) + (2*3.14*(radius*radius)); 
			
	}

	public double calculateVolume(){
		return (3.14*radius*radius*height);
		
	}
	
	public void displayinfo(){
			//Display The Info Here
			
			System.out.print("\nThe Height is = "+height);
			
			System.out.print("\nThe Radius is = "+radius);
			
			System.out.print("\nThe Area is = "+calculateArea());
			
			System.out.print("\nThe Volume is = "+calculateVolume());
			System.out.println();
			
	}	









}	