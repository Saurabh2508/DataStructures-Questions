package Arrays_Questions;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 Algorithm: 

1) Iterate through every element of ar2[] starting from last 
   element. Do following for every element ar2[i]
    a) Store last element of ar1[i]: last = ar1[i]
    b) Loop from last element of ar1[] while element ar1[j] is 
       greater than ar2[i].
          ar1[j+1] = ar1[j] // Move element one position ahead
          j--
    c) If any element of ar1[] was moved or (j != m-1)
          ar1[j+1] = ar2[i] 
          ar2[i] = last
 */
public class D23_Merge_2_sorted_arrays_without_using_Extra_space {
    static int arr1[]=new int[]{1,5,9,10,15,20};
    static int arr2[]=new int[]{2,3,8,13};
    static void merge(int m,int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int j,last=arr1[m-1];
            for(j=m-2;j>=0&&arr1[j]>arr2[i];j--)
                arr1[j+1]=arr1[j];
            if(j!=m-2||last>arr2[i])
            {
                arr1[j+1]=arr2[i];
                arr2[i]=last;
            }
        }
    }
      public static void main(String[] args) 
    {
        merge(arr1.length,arr2.length);
        System.out.print("After Merging nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }
}
/*
Time Complexity: The worst case time complexity of code/algorithm 
is O(m*n). The worst case occurs when all elements of ar1[] are 
greater than all elements of ar2[].
*/