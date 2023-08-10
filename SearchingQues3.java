/*
 * Given a sorted binary array, efficiently count the total number of 1’s in it.

Input 1: arr = [0 0 0 0 1 1 1 1 1 1]

Output 1: 6

Input 2: arr = [ 0 0 0 0 0 1 1]

Output 2: 2
 */

import java.util.Scanner;

public class SearchingQues3 {
    public static int numberOfOnes(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[0] == 1) return n;
            if(arr[n-1] == 0) return 0;

            if (arr[mid] == 1 && arr[mid - 1] == 0) {
                return n - mid;
            } else if (arr[mid] == 0 && arr[mid + 1] == 1) {
                return n - (mid + 1);
            } else if (arr[mid] == 0 && arr[mid + 1] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Total number of 1s are : " + numberOfOnes(arr));
    }
}
