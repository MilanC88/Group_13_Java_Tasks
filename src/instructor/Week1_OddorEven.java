package instructor;


/*
Numbers  ---Odd & Even
write a method which can identifies given number is even or odd


        EX:
             identify(5) -> "Odd"
             identify(6) -> "Even"
*/

public class Week1_OddorEven {


    /*
      QUESTION 1 - Write a method which can identify if a given number odd or even
       Ex: identify(5) -->"Odd"
       identify (6) --> "Even"
      */


    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";

    }

    public static void main(String[] args) {

        System.out.println(identify(5));
    }





}
