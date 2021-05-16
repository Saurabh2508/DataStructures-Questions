package Arrays_Questions;

public class D15_find_Largest_sum_contiguous_Subarray_AKA_Kadane_Algorithm {

    static int largestSum(int[] arr) {
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            } else {

                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum;
        sum = largestSum(arr);

        System.out.println("Largest sum is " + sum);
    }
}
