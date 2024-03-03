package d17loops_arrays;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

        //Example 2: Accept input from user:
        // if password and username are correct: print "Welcome to your account"
        //If username and password are incorrect; print 4 times "Enter your username and password"
        //If username and password are incorrect in fourth time again, print "Account is blocked"
        //username= "admin"    password= "pwd123"

        Scanner input = new Scanner(System.in);
        int counter = 1;

        do{
            if(counter == 5){
                System.out.println("Your account has been blocked!");
                break;
            }

            System.out.println("Enter your username");
            String username = input.next();
            System.out.println("Enter your password");
            String password = input.next();
            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account!");
                break;
            }
            counter++;
        }while(true); //this infinite loop logic. we have logic to break loop in do body. so no problem for infite logic here.
        //when scenario is positive or negative, loop wiil be broken by break keyword. (exit the loop)
    }
}
