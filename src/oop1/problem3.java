package oop1;

import java.util.Scanner;

public class problem3{
	public static void main (String [] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number: ");
		double n=in.nextInt();
		
		if (n < 49.5) {
			System.out.println("F");
			}
		else if (n >= 49.5 && n < 54.5) {
			System.out.println("D");
			} 
		else if (n >= 54.5 && n < 59.5) {
			System.out.println("D+");
			} 
		else if (n >= 59.5 && n < 64.5) {
			System.out.println("C-");
			} 
		else if (n >= 64.5 && n < 69.5) {
			System.out.println("C");
			} 
		else if (n >= 69.5 && n < 74.5) {
			System.out.println("C+");
			} 
		else if (n >= 74.5 && n < 79.5) {
			System.out.println("B-");
			} 
		else if (n >= 79.5 && n < 84.5) {
			System.out.println("B");
			} 
		else if (n >= 84.5 && n < 89.5) {
			System.out.println("B+");
			} 
		else if (n >= 89.5 && n < 94.5) {
			System.out.println("A-");
			} 
		else {
			System.out.println("A");
			}
	}
}

