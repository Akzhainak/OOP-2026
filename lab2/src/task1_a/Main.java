package task1_a;

public class Main {

	public static void main(String[] args) {
		Cube c= new Cube(4);
		Cylinder cy = new Cylinder(4,7);
		Sphere s= new Sphere(4);

		
		System.out.println("cube volume:" + c.Volume());
		System.out.println("cube SurfaceArea:" + c.SurfaceArea());
		System.out.println("Cylinder volume:" + cy.Volume());
		System.out.println("Cylinder SurfaceArea:" + cy .SurfaceArea());
		System.out.println("Sphere volume:" + s.Volume());
		System.out.println("Sphere SurfaceArea:" + s.SurfaceArea());

	}

}
