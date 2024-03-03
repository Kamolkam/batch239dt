package d16loops;

public class WhileLoop01 {

    public static void main(String[] args) {

        //----------- for
        /*
        for(startingValue; condition to exit loop; decrement/increment){
                        //body to execute
                        }
         */
        //----------while
        /*
        starting value
        while(condition to start loop){
                //codes to execute
                //increment/decrement
        }
         */
        //If we know number of iteration for loop is most convenient one.
        //If we don't know number of iteration, while loop is better than for loop
        //Example: print the numbers from 3 to 6 on the console
        for(int i=3; i<7; i++){
            System.out.println(i);
        }
        System.out.println("-----------------");

        //2. way: while loop
        int i = 3;
        while(i<7){
            System.out.println(i);
            i++;
        }

        //Example 1: Print even numbers from 61 to 51....
        int m = 61;
        while(m>50){
            if(m%2 == 0){
                System.out.println(m);
            }
            m--;
        }

    }
}
