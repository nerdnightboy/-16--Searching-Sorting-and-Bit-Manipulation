/*
 Given an array. FInd the number X in the array. If the element is present, return the index of the element,
else print “Element not found in array”. Input the size of array, array from user and the element X from user.
Use Linear Search to find the element. */
import java.util.*;

public class SearchingQues1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of X : ");
        int X = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == X){
                System.out.println("Element present at the " + i + " index of array.");
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("Element not found in array...");

    }
}