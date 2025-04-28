package hikoyat;

public class Task10 {

    public static void main(String[] args) {

        int [] array = {20, 40, 65, 30};

        int minValue = MinNum(array);

        System.out.println(minValue);

    }

    public static int MinNum (int []  array ){

        int minNum = array[0];
        for (int num : array) {

            if (num < minNum) {
                minNum = num;
            }
        }
      return minNum;


    }

}
