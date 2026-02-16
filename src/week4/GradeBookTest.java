package week4;

import week2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Course cs101 = new Course("CS101", "Object-oriented Programming and Design", 4);
        GradeBook myGradeBook = new GradeBook(cs101);

        myGradeBook.displayMessage();
        System.out.println("Please, input grades for students:");

        String[] studentNames = {"A", "B", "C", "D", "E", "F"," G","H","I", "J"};
        
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Student " + studentNames[i] + ": ");
            int grade = input.nextInt();
            
            Student s = new Student(studentNames[i], i + 1, 1);
            myGradeBook.addGrade(s, grade);
        }

        System.out.println();
        myGradeBook.displayGradeReport();
    }
}