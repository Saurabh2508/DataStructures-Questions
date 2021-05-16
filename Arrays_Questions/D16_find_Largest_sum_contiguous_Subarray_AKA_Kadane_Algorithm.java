
package Arrays_Questions;

public class D16_find_Largest_sum_contiguous_Subarray_AKA_Kadane_Algorithm {
    static int largestSum(int[] arr)
    {
        int max_so_far=arr[0];
        int curr_max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            curr_max=Math.max(arr[i],curr_max+arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
       return max_so_far;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3,-4,-6,-8,-9,-1};
        int sum;
        sum = largestSum(arr);

        System.out.println("Largest sum is " + sum);
    }
}
