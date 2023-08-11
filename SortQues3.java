/*
 * WAP to sort an array in decreasing order using insertion sort 
Input Array {3,5,1,6,0} 
Output Array: {6, 5, 3, 1, 0} 

 */

import java.util.Arrays;
import java.util.Scanner;

public class SortQues3 {
    public static void decendingInsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0 && val > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        decendingInsertionSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
