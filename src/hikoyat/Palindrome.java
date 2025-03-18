package hikoyat;
//Check if a String is a Palindrome
//Problem: Given a string, check
// if it reads the same backward as forward. Ignore case and spaces.

public class Palindrome {
    public static void main(String[] args) {

        String str1 = "Madam";
        String str2 = "";

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2 );
        System.out.println(str1.equalsIgnoreCase(str2));

        if (str1.equalsIgnoreCase(str2)){
            System.out.println(str2 + " is Palindrome");
        }else {
            System.out.println(str1 + " is not Palindrome");
        }




    }
}
