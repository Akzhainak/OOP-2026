package task1_a;

public class Cylinder extends Shape3D{
	private double r;
	private double h;
	
	public Cylinder(double r,double h) {
		this.r=r;
		this.h=h;
	}
	public double Volume() {
		return Math.PI*r*r*h;
	}
	public double SurfaceArea() {
		return  r+h;
	}
}
