
package Arrays_Questions;

import java.util.Arrays;


public class D13_Write_a_program_to_cyclically_rotate_an_array_by_one {

    static void rotate(int[] arr) {
        int x = arr[arr.length - 1],i;
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            //System.out.println(Arrays.toString(arr));
        }
        arr[0] = x;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Given array is ");
        System.out.println(Arrays.toString(arr));

        rotate(arr);

        System.out.println("After rotation array is ");
        System.out.println(Arrays.toString(arr));
    }
}
/*Time Complexity: O(n) As we need to iterate through all the elements
Auxiliary Space: O(1)*/