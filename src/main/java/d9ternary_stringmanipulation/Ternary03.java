package d9ternary_stringmanipulation;

public class Ternary03 {

    public static void main(String[] args) {

//NESTED TERNARY

//  (Condition) ? ( Cond ? true-part : fals-part ) : ( Cond ? true-part : fals-part  );

        //What is Leap Year?

        //divisible by 100  ==> must be divisible by 400
        // not divisible by 100  ==> must be divisible by 4

        int year = 1995;

        String isLeap

                = (year%100 == 0) ? (year%400 == 0 ? "Lear Year" : "Not a Leap Year")   :   (year%4 == 0 ? "Leap Year" : "Not a Leap Year");


        System.out.println("is Leap? = " + isLeap);


        // Homework: Print the minimum of two integers on the console



    }
}
