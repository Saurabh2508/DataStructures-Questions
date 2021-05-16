package Arrays_Questions;

public class D12_Find_the_Union_and_Intersection_of_the_two_sorted_arrays {

    static void printUnion(int[] arr1, int[] arr2, int size1, int size2) {
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
           if(arr1[i]<arr2[j])
           {
               System.out.print(arr1[i++]+" ");
           }else if(arr2[j]<arr1[i])
           {
               System.out.print(arr2[j++]+" ");
           }else
           {
               System.out.print(arr2[j++]+" ");
               i++;
           }
        }
        while(i<size1)
        {
            System.out.print(arr1[i++]+" ");
        }
        while(j<size2)
        {
            System.out.print(arr2[j++]+ " ");
        }
        
    }
    static void printIntersection(int[] arr1,int[] arr2,int size1,int size2)
    {
        int i=0,j=0;
        while(i<size1&&j<size2)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                j++;
            }else
            {
                System.out.print(arr1[i++]+" ");
                j++;
            }
        }
        
    }
    public static void main(String args[]) 
    { 
        int arr1[] = { 1, 2, 4, 5, 6 }; 
        int arr2[] = { 2, 5, 3, 7,6 }; 
        int m = arr1.length; 
        int n = arr2.length; 
        printUnion(arr1, arr2, m, n);
        System.out.println("");
        printIntersection(arr1,arr2,m,n);
    } 
}
/*Time Complexity : O(m + n)
Handling duplicates in any of the array : Above code does not handle
duplicates in any of the array. To handle the duplicates, just check 
for every element whether adjacent elements are equal. */