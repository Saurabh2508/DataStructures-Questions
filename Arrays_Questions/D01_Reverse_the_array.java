
package Arrays_Questions;

public class D01_Reverse_the_array {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println("");
        System.out.println("Reverse is:");
        for(int n=arr.length-1;n>0;n--)
        {
            System.out.print(arr[n]+" ");
        }
        
    }
}
