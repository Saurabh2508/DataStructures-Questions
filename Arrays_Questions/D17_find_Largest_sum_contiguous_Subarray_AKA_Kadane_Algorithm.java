package Arrays_Questions;

public class D17_find_Largest_sum_contiguous_Subarray_AKA_Kadane_Algorithm {

    static void largestSum(int arr[]) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0, start = 0;
        int end = 0, s = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if (max_so_far < max_ending_here)  
            { 
                max_so_far = max_ending_here; 
                start = s; 
                end = i; 
            } 
  
            if (max_ending_here < 0)  
            { 
                max_ending_here = 0; 
                s = i + 1; 
            } 
        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        largestSum(arr);
    }
}
