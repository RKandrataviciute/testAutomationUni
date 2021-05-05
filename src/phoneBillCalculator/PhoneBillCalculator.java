package phoneBillCalculator;
/*
* allow the user to input the plan fee and the number of overage minutes.
* charge 25 cents for every minute
* calculate a 15% tax on the subtotal.
* create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.
* print the bill*/

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double planFee;
        double overageMinutes;


        System.out.println("Enter your base plan fee:");
        planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);

        double tax = calculateTax(planFee + overageFee);

        calculateAndPrintBil(planFee,overageFee, tax);



    }

    public static double calculateOverageFee(double overageMinutes){

        double extraMinuteCost = 0.25;

        return overageMinutes * extraMinuteCost;
    }

    public static double calculateTax (double subtotal){

        double taxRate = 0.15;

        return subtotal * taxRate;
    }

    public static void calculateAndPrintBil (double planFee, double overageFee, double tax){

        double billTotal= planFee + overageFee + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overageFee));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", billTotal));

    }

}