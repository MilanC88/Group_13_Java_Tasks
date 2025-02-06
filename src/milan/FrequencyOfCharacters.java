package milan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDD";

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            arr.add(str.charAt(i));
        }

        for (int i = 0; i < arr.size(); i++) {
            int count = Collections.frequency(arr, arr.get(i));


            if(arr.indexOf(arr.get(i)) < i){
                continue;
            }

            System.out.print(arr.get(i) + "" + count);

        }


    }






}
