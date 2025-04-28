package hikoyat;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumZero {

    public static void main(String[] args) {
        int N = 3; // Example input

        System.out.println(Arrays.toString(generateUniqueSumZero(N)));

    }

    public static int[] generateUniqueSumZero(int n) {

        if (n <= 1 || n >= 100) {
            System.err.println("Wrong number");
            System.exit(1);
        }

        List<Integer> result = new ArrayList<>();

        // Generate pairs of positive and negative integers
        for (int i = 1; i <= n / 2; i++) {
            result.add(i);   // Positive number
            result.add(-i);  // Corresponding negative number
        }

        // If N is odd, add 0 to make the sum zero
        // If the remainder when N is divided by 2 isn’t zero, then N is odd
        if (n % 2 != 0) {
            result.add(0);
        }


        // Convert List to int[] without using streams
        int[] resultArray = new int[result.size()];


        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);

        }
        return resultArray;

        // Convert the list to an array and return
        // return result.stream().mapToInt(Integer::intValue).toArray();
    }




}
