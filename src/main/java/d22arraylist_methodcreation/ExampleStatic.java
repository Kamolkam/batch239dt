package d22arraylist_methodcreation;

public class ExampleStatic {
    public static void main(String[] args) {

        ExampleStatic myIns = new ExampleStatic();

        myIns.printText("Hello");

    }


    public void printText(String str){

        System.out.println(str);
        //if a method does not create a new data, return type will be "void"
        //which means dont use return keyword in body
        //and dont declare any data type in method declaration as return type
        //argument (data comes through parameter) is taken and just printed....
    }




    }

