/*
 * Given a positive integer num, return true if num is a perfect square or false otherwise. A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself. 
Example 1: Input: num = 16 Output: true 
Explanation: We return true because 4 * 4 = 16 and 4 is an integer. 
Example 2: Input: num = 14 Output: false 
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */

import java.util.Scanner;

public class SearchingQues5 {
    public static boolean isPerfectSquare(int num){
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int X = sc.nextInt();
        
        if(isPerfectSquare(X)){
            System.out.println("Number is a perfect square.");
        }else{
            System.out.println("Number is not a perfect square.");
        }
    }
}
