package week4;
import java.util.Scanner;

class Data {
	private double max;
	private double sum;
	public int count;
	public Data () {
		this.max=max=0;
		this.count=count=0;
		this.sum=sum=0;
	}
	
	public void add(double x) {
		sum +=x;
		count++;
		if(x>max) max=x;
	}
	
	public double getAverage() {
		if(count==0)return 0;
		return sum/count;
	}
	
	public double getMax() {
		if(count ==0)return 0;
		return max;
	}
	

}
 