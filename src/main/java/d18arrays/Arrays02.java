package d18arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Example: Create an array with 6 elements and print a number less than 5 on the console
        //1,-3,-5,6,7,5 ==>1,-3,-5

        int[] numbers = {1,-3,-5,6,7,5};

        for (int w : numbers){
            if (w<5 ){
                System.out.println(w);
            }
        }

    //Example2: Check the String array if a specific data exist in the array or not..
        //binarySearch() ==> returns the index of specific element of exist..
        //binarySearch()==>sort()method should be used as a prerequisite for binarySearch()method
        //If teh specified data does not exist, binarySearch() method returns a negative
        // if you see "-" => means there is no such element

        String letters[] = {"W", "O", "R", "L", "D"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));//[D, L, O, R, W]

        int indexOfL = Arrays.binarySearch(letters,"L");
        System.out.println("Index Of L : " + indexOfL);//1

        int indexOfP = Arrays.binarySearch(letters,"P");
        System.out.println(indexOfP);////-4 => means if it existed, would be in 4th order (not index)


        //-------------------------

        int[] arr = {2,1,5,6};// give me the example of 5 and 3
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int indexOfFive = Arrays.binarySearch(arr,5); //2
        System.out.println("indexOfFive = " + indexOfFive);

        int indexOfThree = Arrays.binarySearch(arr,3); //indexOfThree = -3
        System.out.println("indexOfThree = " + indexOfThree);


        //Example 3: Print the number of words in the given sentence...
        //"Java is easy, Learn Java earn money"

        String s = "Java is easy, Learn Java earn money";
        String[] words = s.split(" ");
        System.out.println("words: " + Arrays.toString(words));//[Java is easy, Learn Java earn money]
        System.out.println("Number of Words= " + words.length);//7




    }
}
