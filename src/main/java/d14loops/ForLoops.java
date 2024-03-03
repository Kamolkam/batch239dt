package d14loops;

public class ForLoops {
    public static void main(String[] args) {

        /*
        Example 5: In the given String, print all the characters before "m" on the console
        Miami => Mia   or Tramway => Tra
         break keyword...
        */
        String s = "Miami";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'm') {
                break;
            }
            System.out.print(ch); //Mia
        }
        System.out.println("------");


        //Example 6: In the given string, print the string except lowercases in it....
        //"Pwd12?Ab" ==> P12?A
        //continue; keyword is used to skip a data when condition is met.

        String s1 = "Pwd12?Ab";

        for(int i=0; i<s1.length(); i++){

            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z'){

                continue;
            }
            System.out.print(ch);

        }

        System.out.println("....................");


        //Example 7: Reverse the given string below
        // Java => avaJ,  Hello => olleH

        String s2 = "Java";
        String reversed = ""; //create a place to store reversed version...

        for(int i= s2.length()-1;  i>= 0; i--){

            reversed =  reversed + s2.charAt(i);

        }

        System.out.println("reversed = " + reversed); //reversed = avaJ

        if(s2.equals(reversed)){

            System.out.println("This is palindrome!");

        } //interview question



    }
}