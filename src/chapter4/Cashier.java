package chapter4;
import java.util.Scanner;
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

public class Cashier {

    public static void main(String[] args) {

        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt(); //number of items to scan


        double total = 0;

        //loop to iterates through all of the items and adds the costs
        for(int i=0; i<quantity; i++){

            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
