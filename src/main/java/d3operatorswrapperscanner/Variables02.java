package d3operatorswrapperscanner;

public class Variables02 {

    public static void main(String[] args) {


        //NON PRIMITIVE DATA TYPES....
        /*
        1) A created class is a non-primitive data type. (Variables02)
                So, there is no limit for number of non-primitive data types...
        2) Non-primitive data types start with uppercase in naming...
        3) Non-primitive data types have values and methods; so they occupy memory in different sizes...
         */

        // String Data Type (Class) : stores sentences, words, symbols, numbers etc.


        String nameOfStudent = "Martin Tobias"; //non primitive

        int age = 7; //primitive


        //What is the difference between primitive and non-primitive data types?
/*
                1) Primitives store the value we assign
                Non-Primitives contain methods along with the values...

                2) Primitives start with lowercase; non-primitives start with uppercase

                3) Primitives are created by Java and 8.
                 Non-primitives can be created by developers and no limit for number of them

                4) Primitives use memory based on their types from 8 bit to 64 bit
                Non primitives use memory in different sizes based on their number of members (variables and methods)

 */

        //Updating existing container with a new data....

        String city = "Izmir";
        System.out.println("city = " + city);

        city = "Istanbul";
        System.out.println("city updated = " + city);
    }
}




