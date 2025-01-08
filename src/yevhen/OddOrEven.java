package yevhen;

public class OddOrEven {

    // Special method, that can identify if number is odd or even

    public static void CheckOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}

