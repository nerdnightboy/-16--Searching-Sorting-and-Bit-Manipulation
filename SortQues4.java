/*
 * 4 - Find out how many pass would be required to sort the following array in decreasing order using bubble sort 
Input Array {3,5,1,6,0} 
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortQues4 {
    public static int decendingBubbleSortCount(int[] arr){
        int n = arr.length;
        int pass = 0;
        for(int i = 0; i < n-1; i++){
            boolean swap = false;
            for(int j = i+1; j < n; j++){
                if(arr[i]<arr[j]){
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            pass++;
            if(!swap) break;
        }
        return pass;
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
        
        System.out.println("Number of pass : " + decendingBubbleSortCount(arr));
    }
}
