package hikoyat;

import java.lang.String;

public class ReturnMethodString {


//    public static String reverse(String str){
//
//        StringBuilder reversed = new StringBuilder(str);
//        return reversed.reverse().toString();
//
//    }
//
//    public static void main(String[] args) {
//
//        String input = "ABCD";
//        String reversedString = reverse(input);
//        System.out.println("reversedString = " + reversedString);
//
//
//    }

   public static java.lang.String reverse(java.lang.String str){
       StringBuilder reversed = new StringBuilder(str);
       return reversed.reverse().toString();

   }

    public static void main(java.lang.String[] args) {
        java.lang.String input = "ABCD";
        String reversedStr = reverse(input);
        System.out.println("reversedStr = " + reversedStr);
    }

}
