package rollTheDiceGame;
import java.util.Random;

/*The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
*/
public class RollTheDiceGame {
    public static void main(String[] args) {

        int gameBoardSpace = 20;
        int numberOfRolls = 5;
        int currentPosition = 0;

        Random random = new Random();

        System.out.println("Let's roll the dice..");

        for (int i=1; i<=numberOfRolls; i++){

            int roll = random.nextInt(6) + 1; //returns result between 0 and 5, that's why +1 is needed
            currentPosition +=roll;

            System.out.println("Roll number " + i + ". You've rolled a "+ roll);

            if (gameBoardSpace==currentPosition){

                System.out.println("Congratulations! You are on the space "+ currentPosition);
                break;
            }

            else if (gameBoardSpace<currentPosition) {

                System.out.println("Sorry, you've lost this game. Your current position is "+ currentPosition +
                        " and that takes you past "+ gameBoardSpace);
                break;
            }
            else if (gameBoardSpace>currentPosition && i==numberOfRolls){

                System.out.println("Oh no! You did not make it to position "+ gameBoardSpace + ". You are stuck at position "
                + currentPosition);
                break;
            }

            else {

                System.out.println("Your current position is "+ currentPosition +" and you have " + (gameBoardSpace-currentPosition) +
                        " positions to go.");
            }
        }


    }
}
