package d6incrementdecrement_ifstatements;

public class IfStatement01 {

    public static void main(String[] args) {

        //Conditional Statements - If Statements

        //If you study hard, you get offer....

        // if(condition is defined){ if body: contains codes to be executed when condition is true }

        if(5 > 9){
            System.out.println("Message will be visible when condition is true...");

        }

        //--------------------------

        if(10 == 6 + 4){
            System.out.println("Condition is true, you see the message!");
        }

        //Example: Check the given number and print "3 DIGIT" if it has 3 digits....
        int a = 163;

        if(a > 99 && a < 1000){

            System.out.println(a + " has three digits....");
            System.out.println("3 DIGITS");
        }


        //Example1: Check the given number and print "DIGIT" if it is a digit....
//0, 1, 2, 3, 4, 5, 6, 7, 8, 9 => [0-9] => digits

        int x = 17;
        if(x >= 0 && x < 10){


            System.out.println("DIGIT");
        }









    }
}
