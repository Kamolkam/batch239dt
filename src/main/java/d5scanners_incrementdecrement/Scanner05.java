package d5scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //Example:  Ask user to enter the width and the length of a rectangle,
        //           then print the area and perimeter on the console

        //area: width * length
        //perimeter = 2* width + 2*length

        //use float

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for width of rectangle...");
        float shortSide = input.nextFloat();

        System.out.println("Enter a valur for length of rectangle....");
        float longSide = input.nextFloat();

        System.out.println("Area= " + (shortSide * longSide));
        System.out.println("Perimeter= " + (2*(shortSide + longSide)));

    }
}
