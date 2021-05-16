
package Arrays_Questions;

import java.util.Arrays;


public class D08_Find_the_Kth_max_and_min_element_of_an_array {
    static class MinMax{
        int min;
        int max;
    }
    public static MinMax kthSmallestandLargest(int[] arr,int k)
    {
        MinMax minmax=new MinMax();
        Arrays.sort(arr);
        minmax.min=arr[k-1];
        minmax.max=arr[arr.length-k];
        return minmax;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 3000};
        int k=3;
        MinMax minmax=new MinMax();
        minmax=kthSmallestandLargest(arr,k);
        System.out.println("kth smallest element is "+minmax.min);
        System.out.println("kth largest element is "+minmax.max);
    }
}
/*Time Complexity of this solution is O(N Log N)*/
