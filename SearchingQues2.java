/*
 * Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
not present return -1.

Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4

Output 1: 6

Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15

Output 2: -1
 */

import java.util.Scanner;

public class SearchingQues2 {
    public static int lastOccurrenceTarget(int[] arr, int trgt){
        int n = arr.length - 1;
        while(n >= 0){
            if(arr[n] == trgt){
                return n;
            }
            n--;
        }
        return -1;
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
        
        System.out.println("Last occurrence index of target element is : " + lastOccurrenceTarget(arr, X));
    }
}
