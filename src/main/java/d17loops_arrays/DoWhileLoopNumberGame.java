package d17loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopNumberGame {
    public static void main(String[] args) {

        //Example: Create a number between 0-100 by using Random Class
        //Ask user to guess the number with an entry
        //Create some logic with If=>
        //If the entered number is less than random number print "You entered a smaller number"
        //If the entered number is greater than random number print "You entered a greater number"
        //If the entered one and the random one match print "Congrats, your guess is correct"

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //we created an instance from Random class to create a random number...
        //let's create a random number in the range of 0 and 100
        int randomNum = random.nextInt(101); //how to create a random in the range of 20-100? Homework!
//to keep entered number create our container here
        int guessedNum;
//To check if guess of user is correct or not
        boolean guessOfUser = false;
        //let's create a container to keep number of trials
        int numOfTrial = 0;
        do{
            System.out.println("Please guess a number for the game");
            guessedNum = scanner.nextInt();
            //after each guess, increase by 1
            numOfTrial++;
            //lets check guess and random
            if(guessedNum < randomNum){
                System.out.println("You entered a smaller number");
            } else if (guessedNum > randomNum) {
                System.out.println("You entered a greater number");
            }else{
                guessOfUser = true; //when user guess the number correctly, value must be true
                System.out.println("Congrats, you guessed number correctly!");
                System.out.println("Number of Trial: " + numOfTrial);
            }
        }while(!guessOfUser);

    }
}
