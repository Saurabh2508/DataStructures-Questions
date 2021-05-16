package String_Questions;

public class D09_Find_Duplicate_characters_in_a_string {

    static final int NO_OF_CHARS = 256;

    static void fillCharCounts(String str, int[] count) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++; 
        }
    }

    static void printDups(String str) {
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + ", count= " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        printDups(str);
    }
}
/*
Time Complexity: O(n), where n = length of the string passed

Space Complexity: O(NO_OF_CHARS)
Hashing involves the use of an array of fixed size each time no matter whatever the string is. 

For example, str = “aaaaaaaaaa”. 

An array of size 256 is used for str, only 1 block out of total size (256) will be utilized to store the number of occurrences of ‘a’ in str (i.e count[‘a’] = 10). 

Rest 256 – 1 = 255 blocks remain unused. 

Thus, Space Complexity is potentially high for such cases. 
So, to avoid any discrepancies and to improve Space Complexity,
maps are generally preferred over long-sized arrays. 
*/
