package d15loops;

public class ForLoop01 {
    public static void main(String[] args) {



        //Example: Calculate total value of the integers from 5 to 9

        int sum = 0;
        System.out.println("sum = " + sum);

        for(int i=5;  i<10; i++){
            sum = sum + i;
            System.out.println("sum = " + sum + "  added with " + i );
        }
        System.out.println("sum = " + sum); //35


        //Example 2: Calculate the multiplication of the numbers from 10 to 7

        int mult = 1;

        for(int i=10; i>6; i--){
            mult = mult * i;
            System.out.println("mult = " + mult);

        }

        System.out.println("mult = " + mult);
    }
}
