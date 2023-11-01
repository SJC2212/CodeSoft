package task_2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSub = scn.nextInt();


        int totalMarks = 0;

        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks obtained in subject " + i + " out of 100: ");
            int marks = scn.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks.");
                return;
            }

            totalMarks += marks;
        }
        System.out.println("Total Marks: " + totalMarks);


        float avg_pr = (float) totalMarks / (numSub * 100) * 100;

        System.out.println("Average Percentage: " + avg_pr + "%");

        char grade;
        if (avg_pr >= 90) {
            grade = 'A';
            System.out.println("your grade is " + grade);
        } else if (avg_pr >= 80) {
            grade = 'B';
            System.out.println("your grade is " + grade);

        } else if (avg_pr >= 70) {
            grade = 'C';
            System.out.println("You obtained grade  " + grade);

        } else if (avg_pr >= 60) {
            grade = 'D';
            System.out.println("You obtained grade " + grade);
        } else if (avg_pr >= 50) {
            grade = 'E';
            System.out.println("You obtained grade " + grade);


        } else {
            grade = 'F';
            System.out.println("You obtained grade " +grade+ " ,Sorry you failed!");

        }


    }
}
