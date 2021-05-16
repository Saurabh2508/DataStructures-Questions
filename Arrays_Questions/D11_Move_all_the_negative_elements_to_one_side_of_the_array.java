package Arrays_Questions;

public class D11_Move_all_the_negative_elements_to_one_side_of_the_array {

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    static void moveNegative(int []arr,int n)
    {
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0)
            {
                if(i!=j)
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
                j++;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = { -1,2,-3,4,-5 };
        int n = arr.length;
 
        moveNegative(arr, n);
        printArray(arr, n);
    }
}
