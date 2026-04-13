package task1_a;

public class Sphere extends Shape3D{
	private double r;
	
	public Sphere (double r) {
		this.r=r;
	}
	
	public double Volume() {
		return 4*r;
	}
	
	public double SurfaceArea() {
		return 4*Math.PI* r*r;
	}
}
