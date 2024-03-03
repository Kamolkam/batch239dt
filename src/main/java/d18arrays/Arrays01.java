package d18arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example: Create an Array in int data type, and store 6 elements
        // calculate total value of min and max values in the array

        //sort() => used to sort elements in ascending order (smaller to larger)
        //it sorts String elements in alphabetical order

/*
        int[] ages = new int[6];
        ages[0]=12;
        ages[1]=11;
        ages[2]=14;
        ages[3]=17;
        ages[4]=10;
        ages[5]=13;
        System.out.println(Arrays.toString(ages));*/

        //2.way to create array

        int[] ages = {12,11,14,17,10,13};
        System.out.println(Arrays.toString(ages));//[12, 11, 14, 17, 10, 13]

        Arrays.sort(ages); // it will return sorter version from smaller to larger
        System.out.println(Arrays.toString(ages));//[10, 11, 12, 13, 14, 17]

        int min = ages[0];
        int max = ages[ages.length-1];//we can use 5
        System.out.println("Total value of min and max: " + (min + max));

        //2.way: for each loop
        // Math.max() =>compares two values and return greatest one
        int[] ages1 = {12,11,14,17,10,13};
        int maximum = ages1[0];
        int minimum = ages[0];
        for (int w: ages1){

            maximum =  Math.max(maximum, w);
            minimum = Math.min(minimum, w);

        }
        System.out.println("Total: " + (maximum + minimum)); // Total 27

     /*  int x = Math.max(17,99);
        System.out.println("x = " + x);*/
    }
}
