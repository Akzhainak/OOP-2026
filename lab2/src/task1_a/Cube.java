package task1_a;

public class Cube extends Shape3D{
	private double a;
	
	public Cube (double a) {
		this.a=a;
	}
	public double Volume() {
		return a*a*a;
	}
	
	public double SurfaceArea() {
		return a*a;
	}
}
