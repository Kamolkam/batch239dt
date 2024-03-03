package d21arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        //How to create an ArrayList?
        // ArrayList<Integer> ages = new ArrayList<Integer>(); //java 6 and before
        ArrayList<Integer> ages = new ArrayList<>(); // java 7 and later versions
        System.out.println(ages);

        //How to add elements into ArrayList
        ages.add(13);
        ages.add(12);
        ages.add(5);
        System.out.println(ages); //[13, 12, 5]

        //How to add element into a specific index
        ages.add(1, 25);
        System.out.println("After adding element to a specific index: " + ages); //[13, 25, 12, 5]

        //add 19 between 25 and 12....
        ages.add(2, 19);
        System.out.println(ages); //[13, 25, 19, 12, 5]

        //How to add 33 to the end of arraylist
        ages.add(33);
        System.out.println(ages);//[13, 25, 19, 12, 5, 33]


        //Example: Put the given array below into the existing array (ages)
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


        //get() and set() in ArrayList....
        //learn the functionalities...
        int a = ages.get(3);
        System.out.println(a); //12

        ages.set(3, 99); //will replace the element from index 3 with 99
        System.out.println(ages); //[13, 25, 19, 99, 5, 33, 1, 2, 3]


        //Example1: Create an Integer arraylist and change odd elements with 10
        // 23, 24, 12, 18, 9

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(23);
        myArray.add(24);
        myArray.add(12);
        myArray.add(18);
        myArray.add(9);
        System.out.println("myArray = " + myArray); //myArray = [23, 24, 12, 18, 9]

        for(Integer w : myArray){ //[23, 24, 12, 18, 9]
            if(w%2 != 0){

                myArray.set(myArray.indexOf(w), 10);
            }
        }
        System.out.println("After Removing Odds:  " +myArray); //After Removing Odds:  [10, 24, 12, 18, 10]

    }
}
