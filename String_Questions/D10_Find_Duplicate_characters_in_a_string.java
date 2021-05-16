 package String_Questions;

import java.util.HashMap;
import java.util.Map;

public class D10_Find_Duplicate_characters_in_a_string {

    static void printDups(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), 1);
            }
            else
            {
                count.put(str.charAt(i), count.get(str.charAt(i))+1);
            }
        }
        for(Map.Entry mapElement: count.entrySet())
        {
            char key=(char)mapElement.getKey();
            int value=((int)mapElement.getValue());
            
            if(value>1)
            {
                System.out.println(key+", count= "+value);
            }
        }
    }
    public static void main(String[] args) {
        String str="test string";
        printDups(str);
    }
}
/*
Time Complexity: O(N log N), where N = length of the string
passed and it generally takes logN time for an element insertion
in a map.
Space Complexity: O(K), where K = size of the map 
(0<=K<=input_string_length).
*/
