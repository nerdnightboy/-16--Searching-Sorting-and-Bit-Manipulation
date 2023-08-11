/*
 * Find out the number of iterations to sort the array in descending order using selection sort.
Input Array {3,5,1,6,0}
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortQues5 {
    public static int decendingSelectionSortCount(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean swap = false;
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                swap = true;
            }
            count++;
            if(!swap) break;
        }
        return count;
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
        
        System.out.println("Total number of  : " + decendingSelectionSortCount(arr));
    }
}