package Arrays_Questions;

public class D04_Maximum_and_Minimum_of_Array {
    public static void main(String[] args) {
        int[] arr={1,45,5,6,3345,67,3};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(arr[i]>max)
                    max=arr[i];
                }
                else
                {
                    if(arr[j]>max)
                    max=arr[j];
                }
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    if(arr[i]<min) {
                        min=arr[i];
                    }
                }
                else
                {
                    if(arr[j]<min)
                        min=arr[j];
                }
            }
        }
        System.out.println(min);
    }
}
