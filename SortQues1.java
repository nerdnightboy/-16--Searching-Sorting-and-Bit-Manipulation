/*
 * 1 -  Write a program to sort an array in descending order using bubble sort. 
Input Array: {3,5,1,6,0} 
Output Array: {6, 5, 3, 1, 0} 

 */

import java.util.Scanner;
import java.util.Arrays;

public class SortQues1 {
    public static void decendingBubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
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
        decendingBubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
