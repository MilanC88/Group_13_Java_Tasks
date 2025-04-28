package hikoyat;

import java.lang.String;

public class MinNumber {

    public static void main(String[] args) {

        int [] array = {80, 40, 65, 30};
                        // 0 1   2    3
        int minValue = minNum(array);

        System.out.println(minValue);
    }


    public static int minNum (int []  array ){

        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");

        }

        int minNum = array[0]; // 40 -> 30

        for (int num : array) {

            if (num < minNum) {
                // 80, 40, 65, 30
                // 80  < 80
                // 40 < 80
                // 65 < 40
                // 30 < 40
                minNum = num;
            }
        }
        return minNum;


    }

}
