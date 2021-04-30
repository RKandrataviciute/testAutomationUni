package chapter3;

/*
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10; //More than 10 sales = bonus

        //Input for how many sales employee made
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Bonus decision
        if (sales>quota){
            salary+=bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
