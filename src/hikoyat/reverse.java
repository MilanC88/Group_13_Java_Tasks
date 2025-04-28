package hikoyat;

import java.lang.String;

public class reverse {
//    public static void main(String[] args) {
//
//        int[] nums = {-12345};
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0 ){
//                nums[i] = -nums[i];
//            }
//        }
//
//        for (int num : nums ) {
//            System.out.println(num);
//        }
//
//
//
//    }

    public static void main(String[] args) {
        int number = -12345; // Example negative number
        int reversed = reverseNegativeNumber(number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0;
        // Convert number to positive if it's negative
        number = Math.abs(number);
        int reversed = 0;

        // Reverse the digits
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // If the number was negative, make the reversed number negative
        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }

}
