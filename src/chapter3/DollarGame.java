package chapter3;
/*
So, you're going to create a program that asks the user to enter the quantities for the following coins.
You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.*/

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;
        double total;
        double amountShort;
        double amountOver;

        System.out.println("Goal  - enter enough change to make exactly $1.00");

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int numberOfNickels = scanner.nextInt();

        System.out.println("How many dimes?");
        int numberOfDimes = scanner.nextInt();

        System.out.println("And how many quarters?");
        int numberOfQuarters = scanner.nextInt();

        scanner.close();

        total=penny*numberOfPennies + nickel*numberOfNickels + dime*numberOfDimes + quarter*numberOfQuarters;

        if(total < dollar){
            amountShort = dollar - total;

            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
          amountOver = total - dollar;

            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }



    }

}
