package Arrays_Questions;

/**
 find duplicate in an array of N+1 Integers
 * 
 * 
Traverse the array from start to end.
For every element,take its absolute value and if the
* abs(array[i])‘th element is positive, the element has not 
* encountered before, else if negative the element has been 
* encountered before print the absolute value of the current 
* element.
 */
public class D21_find_duplicate_in_an_array_of_N_1_Integers {
    static void printRepeating(int arr[],int size)
    {
        int i;
        System.out.println("The repeating elements are :");
        for(i=0;i<size;i++)
        {
            int j=Math.abs(arr[i]);
            System.out.println("j is "+j);
            if(arr[j]>=0)
                arr[j]=-arr[j];
            else
                System.out.println(j+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
        int arr_size = arr.length;
 
        printRepeating(arr, arr_size);
    }
}
/*
Complexity Analysis: 

Time Complexity: O(n), only one traversal is needed, so 
time complexity is O(n)
Auxiliary Space: O(1), no extra space is required, so space
complexity is constant.
*/