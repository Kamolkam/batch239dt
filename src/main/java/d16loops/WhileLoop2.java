package d16loops;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        //Example: Create a multiplication table on the console fo the given number by the user
//table will be like this:
/*
  3 ==> 3x1=3
        3x2=6
        3x3=9
        3x4=12
        ....
        3x10=30
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to draw multiplication table!");

        int num = input.nextInt();
        int i = 1;
        while(i<11){

            System.out.println(num + "x" + i + " = " + (num*i));
            i++;
        }




    }
}
