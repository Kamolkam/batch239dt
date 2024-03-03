package d20arrays_arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        //What is ArrayList?
        /*
        1)ArrayList is a dynamic structure. This means the size of the ArrayList can automatically adjust during the
        addition or removal of the elements.
        2)ArrayList cannot store primitives, bcs primitives are not reference types. Reference types are references
        that point to an Object. But primitives, on the other hand, are direct values...
        As a real-life example, a shopping list can be represented as an ArrayList.
        The shopping list contains a list of name of products. Products are String reference types...
         */
        /*
        1) Arrays can store primitive data types and references, But ArrayList store non-primitives(references)
        2) ArrayList occupy more space in memory compared to Arrays
        3) When creating arrays, you must specify number of elements from the beginning
        4) ArrayLists are flexible in terms of the number of elements
       5) Why didn't Java abolish Arrays?
       a) Arrays are faster
       b) Arrays occupy very little space in memory
       c) Therefore, arrays are preferred for storing data with a known number of elements
         6) When we encounter primitives, we can use their wrapper (class)format in ArrayList
         */


        //How to create an ArrayList?
        // ArrayList<Integer> ages = new ArrayList<Integer>(); //java 6 and before
        ArrayList<Integer> ages = new ArrayList<>(); // java 7 and later versions

        //How to add elements into ArrayList
        ages.add(13);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);//[13, 12, 5]


        //How to add element into a specific index
        ages.add(1, 25);
        System.out.println("After adding elment to a specific index: " + ages); //[13, 25, 12, 5]


        //add 19 between 25 and 12..

        ages.add(2,19);
        System.out.println(ages);

        //add 33 to the end

        ages.add(33);
        System.out.println(ages);

        //Example: Put the given array below into the existing array
        //addAll()
        // elements for new array => 1, 2, 3

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);

        ages.addAll(newAges);
        System.out.println("ages = " + ages); //ages = [13, 25, 19, 12, 5, 33, 1, 2, 3]


        //addAll() => combines two different arrayList in one single...

        //
        ages.addAll(0, newAges);
        System.out.println(ages); //[1, 2, 3, 13, 25, 19, 12, 5, 33, 1, 2, 3]

        //calculate number of elements in an ArrayList
        int numOfElements = ages.size();
        System.out.println("numOfElements = " + numOfElements); //12

        //get() and set() in ArrayList....
        //learn the functionalities...













    }
}
