/*
 * Given an integer array, duplicates are present in it in a way that all duplicates appear an even number of times except one which appears an odd number of times. Find that odd appearing element in linear time and without using any extra memory. For example, 
Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3] 
Output : The odd occurring element is 4.

 */

import java.util.*;

public class NumberSys5 {
    public static int oddOccurrance(int[] arr){
        int result = 0;
        for (int num : arr) {
            result = result ^ num;
        }
        return result;
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

        //Assuming that there will be only one element with odd occuring at a time
        System.out.println("The element with odd occuring is : " + oddOccurrance(arr));
    }
}
