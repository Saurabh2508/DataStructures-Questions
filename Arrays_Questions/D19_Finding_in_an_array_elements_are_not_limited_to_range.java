package Arrays_Questions;

import java.util.ArrayList;

public class D19_Finding_in_an_array_elements_are_not_limited_to_range {

    static void findDuplicates(int[] arr, int len) {
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    } else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if (ifPresent == true) {
            System.out.println(al + " ");
        } else {
            System.out.println("No duplicates present in arrays");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int n = arr.length;

        findDuplicates(arr, n);
    }
}
/*
Time Complexity: O(N2) 
Auxiliary Space: O(N)
*/
