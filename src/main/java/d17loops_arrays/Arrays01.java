package d17loops_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
1) Arrays: This is a structure allows storing multiple data. For example, the names of students in your class
2) Arrays can store only one data type. That means an int array can store only int values,
    a String array can store only String value

3)To create an array, you need to specify i)Data Type  ii) Data Size
    (Maximum value that can be specified for array size limited to Integer.Max_VALUE, approximately 2 billion..)
4)Arrays are faster than other collections, bcs their sizes are fixed
5) Arrays use less memory than other collections because they do not have extra metadata or functionality
6) Arrays can stor both primitive data types and object references (such as String, Integer, wrapper types etc.)

 */

        // how to create Array

        String[] stdNames = new String[3]; //recommended
        // String stdNames1[] = new String[5];

        // System.out.println(stdNames); //[Ljava.lang.String;@a09ee92
        //in Arrays class we need to use toString method for printing array on the console


        System.out.println(Arrays.toString(stdNames)); //Arrays.toString()
        // [null, null, null]

        //Example: Create an array with int data type and name it notes...reserve 5 places
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0, 0, 0, 0, 0]

        //Example 1: Create an array with Integer data type for 10 elements .
        Integer[]numbers = new Integer[10];
        System.out.println(Arrays.toString(numbers));//[null,null,null,null,null,null,null,null,null,null]

        //Example 2: Create an array to store 3 names in it..

        String[]names = new String[3];
        System.out.println(Arrays.toString(names));//null,null,null

        //How to add elements
        names[0] = "Tom Hardy";
        names[1] = "Mike Tyson";
        System.out.println(Arrays.toString(names));//[Tom Hardy, Mike Tyson, null]

        names[2] = "Mary Jane";
        System.out.println(Arrays.toString(names));//[Tom Hardy, Mike Tyson, Mary Jane]

        //How to print a specific element from Array
        System.out.println(names[1]);

        String second = names[1];
        System.out.println("second = " + second);


        //Example 3: Create an Array for store 5 city names and print on the console

        String[] cities = new String[5];

        cities[0] = "San Diego";
        cities[1] = "Istanbul";
        cities[2] = "New York";
        cities[3] = "Adana";
        cities[4] = "Houston";

        System.out.println(Arrays.toString(cities)); //[San Diego, Istanbul, New York, Adana, Houston]

        //print the elements one by one on the console
        for(int i=0; i< cities.length; i++){ //length is property or field which is giving number of elements

            System.out.println(cities[i]);

        }

        System.out.println("-------------");
        //2. Way:  for-each loop (enhanced loop)
        //in this loop; starting value, condition, direction is defined automatically
        //But there is only one single direction, from beginning to end

        // for (elementDataType variable : arrayName/collectionName){  }

        for(String c : cities){     //[San Diego, Istanbul, New York, Adana, Houston]

            System.out.println(c);
        }


    }
}
