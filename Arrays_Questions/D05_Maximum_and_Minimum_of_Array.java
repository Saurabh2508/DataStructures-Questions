package Arrays_Questions;
//METHOD 1 (Simple Linear Search) 
//Initialize values of min and max as minimum and maximum of the first two elements respectively. 
//Starting from 3rd, compare each element with max and min, and change max and min
//accordingly (i.e., if the element is smaller than min then change min, else if the element is greater
//than max then change max, else ignore the element) 

public class D05_Maximum_and_Minimum_of_Array {

    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int size) {
        Pair minmax = new Pair();
        if (size == 1) {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (int i = 2; i < size; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330};
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Minimum: " + minmax.min);
        System.out.println("Maximum: " + minmax.max);
    }
}
//Time Complexity: O(n)
//
//In this method, the total number of comparisons is 1 + 2(n-2) in the worst case and 1 + n – 2 in
//the best case. 
//In the above implementation, the worst case occurs when elements are sorted in descending order
//and the best case occurs when elements are sorted in ascending order.
