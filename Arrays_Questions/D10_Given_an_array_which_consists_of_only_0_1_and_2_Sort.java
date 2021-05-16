package Arrays_Questions;

public class D10_Given_an_array_which_consists_of_only_0_1_and_2_Sort {

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void sortArr(int arr[], int n) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        sortArr(arr, n);
        printArr(arr, n);
    }
}
/*Complexity Analysis:
 Time Complexity: O(n).
  Only two traversals of the array is needed.
  Space Complexity: O(1).
  As no extra space is required.*/
