package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Enter number of test:");
        int numberOfTests = scanner.nextInt();



        //Process all students
        for(int i=0; i< numberOfStudents; i++){
            System.out.println("Calculating average test score for student #" +(i+1));

            double total = 0;
            for(int j=0; j<numberOfTests; j++){

                System.out.println("Enter the score for Test #" + (j+1));

                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
