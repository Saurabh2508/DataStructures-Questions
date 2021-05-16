
package Arrays_Questions;

public class D09_Given_an_array_which_consists_of_only_0_1_and_2_Sort {
   static void sort012(int []a,int arr_size)
   {
       int lo=0;
       int hi=arr_size-1;
       int mid=0,temp=0;
       while(mid<=hi)
       {
           switch(a[mid])
           {
               case 0: {
                   temp=a[lo];
                   a[lo]=a[mid];
                   a[mid]=temp;
                   lo++;
                   mid++;
                   break;
               }
               case 1:
                   mid++;
                   break;
               case 2:{
                   temp=a[mid];
                   a[mid]=a[hi];
                   a[hi]=temp;
                   hi--;
                   break;
               }
           }
       }
   }
   static void printArray(int arr[],int arr_size)
   {
       int i;
       for(i=0;i<arr_size;i++)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.println("");
   }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,2,1,2,0,0,0,1};
        int arr_size=arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation");
        printArray(arr,arr_size);
    }
}
/*Complexity Analysis:
Time Complexity: O(n).
Only one traversal of the array is needed.
Space Complexity: O(1).
No extra space is required.
The above code performs unnecessary swaps for some inputs which 
are not really required. It can be modified to reduce some swaps.*/