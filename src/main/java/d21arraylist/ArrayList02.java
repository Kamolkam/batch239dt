package d21arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example1: Create an ArrayList with repeated characters, and move them to a new array as unique elements
        // J, a, v, a, v

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); //[J, a, v, a, v]

        ArrayList<Character> b = new ArrayList<>();  //new array to move unique elements: J, a, v
        for (Character c : a){ //[J, a, v, a, v]

            if(!b.contains(c)){

                b.add(c);
            }

        }
        System.out.println("b = " + b); //b = [J, a, v]

    }
}
