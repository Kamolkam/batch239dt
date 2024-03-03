package d5scanners_incrementdecrement;

import java.util.Scanner; //automatically showed up when type Scanner in line 18....

public class Scanner02 {

    public static void main(String[] args) {


        /* Example: Ask user to enter:
            i) Firstname and Lastname
            ii) Age
            iii) Height
            iv) Weight
            v) Marital Status
                    then, print those data with labels in different lines on the console...  */

        //lets call Scanner class and create object first
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name and lastname"); //I want to get multiple words at once
        String fullName = input.nextLine(); //allows user to enter multiple words with spaces between them

        System.out.println("Please enter your age");
        byte age = input.nextByte();

        System.out.println("Please enter your height");
        float height = input.nextFloat();

        System.out.println("Please enter your weight");
        short weight = input.nextShort();


/*
        System.out.println("Enter your marital status1");
        String maritalStatus1 = input.nextLine();*/



        //After numeric input, using nextLine() is problematic....
        //So we used just next()
        System.out.println("Enter your marital status");
        String maritalStatus = input.next(); //next() method allows me to enter just one single word...


        System.out.println("Full name= " + fullName);
        System.out.println("Age= " + age);
        System.out.println("Height= " + height);
        System.out.println("Weight= " + weight);
        //  System.out.println("Marital Status1= " + maritalStatus1);
        System.out.println("Marital Status= " + maritalStatus);


    }
}
