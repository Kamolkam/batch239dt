package d15loops;

public class NestedLoops02 {
    public static void main(String[] args) {

                        /*
                Draw the following pattern on the console:

                *
                * *
                * * *
                * * * *

                 */

                        for(int i=1; i<=4; i++){

                            for(int k=1; k<=i; k++){

                                System.out.print("* ");


                            }
                            System.out.println();

                        }
                        //to sum up: value of (i) which is row number...
                        //...defining number of repetition in nested loop where columns created...


                    //Example: Calculate total value of digits in decimal part in the given data...
                     double num = 28.587;
                    //valueOf() => split() => valueOf => loops with sum container
                    // 5 + 8 + 7 => 20
                    System.out.println("num = " + num);

                    String strNum = String.valueOf(num);
                    System.out.println("strNum = " + strNum);









    }
}
