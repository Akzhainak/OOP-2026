package week4;

import week2.Student; 
import java.util.*;

public class GradeBook {
    private Course course;
    private Map<Student, Integer> studentGrades;

    public GradeBook(Course course) {
        this.course = course;
        this.studentGrades = new HashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public void addGrade(Student student, int grade) {
        studentGrades.put(student, grade);
    }

    public double determineClassAverage() {
        if (studentGrades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : studentGrades.values()) {
            sum += grade;
        }
        return (double) sum / studentGrades.size();
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int lowGrade = 101;
        int highGrade = -1;
        Student lowestStudent = null;
        Student highestStudent = null;

        for (Map.Entry<Student, Integer> entry : studentGrades.entrySet()) {
            int grade = entry.getValue();
            if (grade < lowGrade) {
                lowGrade = grade;
                lowestStudent = entry.getKey();
            }
            if (grade > highGrade) {
                highGrade = grade;
                highestStudent = entry.getKey();
            }
        }

        System.out.printf("Class average is %.2f. ", avg);
        System.out.println("Lowest grade is " + lowGrade + " (" + lowestStudent.getName() + ", id: " + lowestStudent.getID() + ").");
        System.out.println("Highest grade is " + highGrade + " (" + highestStudent.getName() + ", id: " + highestStudent.getID() + ").");
        
        outputBarChart();
    }

    public void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11]; 

        for (int grade : studentGrades.values()) {
            if (grade == 100) frequency[10]++;
            else frequency[grade / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
