package d9ternary_stringmanipulation;

public class Ternary01{

    public static void main(String[] args) {


        //Example: If two numbers have the same sign, return multiplication of them
// if signs are different, print "I can not multiply the number with different sign!"


        int a = 4;
        int b = 5;



        Object result =  ( a < 0 && b < 0) || (a > 0 && b >0) ? (a*b)  : ("I can not multiply the number with different sign!");


        System.out.println("result = " + result);
    }

//Object is like Adam for mankind. It is above all the data types and covers all of them...
//It used memory  more, but sometimes we can use it to consider possible results in different data types...


    }

