package d14loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Interview Question
       //Example 8: Calculate total value of the digits in the given integer.
       // 745 => 7 + 4 + 5 = 16

        int sum = 0; //to store result after addition operations in every loop

        for(int i=745; i>0; i /=10){

            sum = sum + i % 10;
        }

        System.out.println("sum = " + sum);

        //Homework: Calculate total value of first two digits and last two digits in the given integer
        // 1997 => 19 + 97 = 116
        //decrement can be dividing by 100

        int sum1 = 0;
        for(int i = 1997; i > 0; i /= 100){
            sum1 += i% 100;
        }
        System.out.println("sum1=" + sum1);




        //Example 9: Print non-repeated characters of the given String on the console
       // "loops" => lps

      //indexOf and lastIndexOf

      String s3 = "loops";
      String uniqueChars = "";

      for(int i=0; i<s3.length(); i++){

          char ch = s3.charAt(i);

          if(s3.indexOf(ch) == s3.lastIndexOf(ch)){

              uniqueChars = uniqueChars + ch; // uniqueChars += ch;


          }
      }


        System.out.println("uniqueChars = " + uniqueChars); //uniquechars = lps
    }
}
