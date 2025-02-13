package hikoyat;
//Swap two string using Substring:
// Write a program to swap the two strings using substring.
//Input: Hello world
//Output: World Hello

public class Swap {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        str1 = str1 + str2;   //
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1 + " " + str2);


        System.out.println(" ===============================");
        String str3 = "Hello";
        String str4 = "Guys";
        String swap = "";

        swap = str4;
        str4 = str3;
        str3 = swap;
        System.out.println(str3 +" "+ str4);


    }
}
