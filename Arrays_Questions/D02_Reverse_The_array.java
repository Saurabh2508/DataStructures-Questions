
package Arrays_Questions;

public class D02_Reverse_The_array {
    static void reverseArray(int [] arr,int start,int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,64,55,3467,4,6,3,7,3};
        printArray(arr,arr.length);
        reverseArray(arr,0,arr.length-1);
        printArray(arr,arr.length);
    }
}
/*Time Complexity : O(n)*/