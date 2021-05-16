package Arrays_Questions;

/*METHOD 3 (Compare in Pairs) 
If n is odd then initialize min and max as first element. 
If n is even then initialize min and max as minimum and maximum of the first two elements respectively. 
For rest of the elements, pick them in pairs and compare their 
maximum and minimum with max and min respectively. */
public class D07_Maximum_and_minimum_of_Array {

    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();
        int i;
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.max = arr[1];
                minmax.min = arr[0];
            }
            i = 2;
        } else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
        }
        /* In the while loop, pick elements in pair and  
     compare the pair with max and min so far */
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
            /* Increment the index by 2 as two  
               elements are processed in loop */
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Minimum: " + minmax.min);
        System.out.println("Maximum: " + minmax.max);
    }
}
/*Time Complexity: O(n)

Total number of comparisons: Different for even and odd n, see below: 

       If n is odd:    3*(n-1)/2  
       If n is even:   1 Initial comparison for initializing min and max, 
                           and 3(n-2)/2 comparisons for rest of the elements  
                      =  1 + 3*(n-2)/2 = 3n/2 -2
Second and third approaches make the equal number of comparisons when n is a power of 2. 
In general, method 3 seems to be the best.
*/
