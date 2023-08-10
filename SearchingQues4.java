/*
 * Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
is not found in the array, report that as well.
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 5
Output: Target 5 occurs 3 times
Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
target = 6
Output: Target 6 occurs 2 times
 */

import java.util.Scanner;

public class SearchingQues4 {
    public static int totalOccurrenceTarget(int[] arr, int trgt){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == trgt){
                count++;
            }
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

        System.out.println("Enter the value of target : ");
        int X = sc.nextInt();
        
        System.out.println("Total number of target element are : " + totalOccurrenceTarget(arr, X));
    }
}
