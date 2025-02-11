package milan;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDD";

        Map<Character, Integer> frequency = new HashMap<>();

        for(int i= 0; i < str.length(); i++){
            char letter = str.charAt(i);
            frequency.put(letter, frequency.getOrDefault(letter, 0) +1);
        }

        for(Map.Entry<Character, Integer> eachLetter : frequency.entrySet()){
            System.out.print(eachLetter.getKey()+""+eachLetter.getValue());
        }


    }

}
