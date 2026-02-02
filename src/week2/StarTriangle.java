package week2;


public class StarTriangle {
	
	
	private int width;
	
	public StarTriangle(int width) {
		this.width=width;
	}
	
	public String toString() {
		String s="";
		for(int i=1;i<=width;i++) {
			for(int j=1;j<=i;j++) {
			s += "[*]";
			}
			if (i<width) s=s+"\n";
			}
		return s;
}
	
	
	public static void main(String [] args) {
		StarTriangle small = new StarTriangle (3) ;
		System.out.println(small.toString());
		}
	}
		

	
	
	

