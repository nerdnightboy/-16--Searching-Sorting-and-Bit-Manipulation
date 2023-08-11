/*
 * given a number ‘n’, predict whether it is a power of two or not. [medium] 
Input 1: n = 15 
Output 1: False 
Input 2: n = 32 
Output 2: True
 */

import java.util.Scanner;

public class NumberSysQues2 {
    public static boolean powerOfTwo(int num) {
        StringBuilder res = new StringBuilder();
        if (num == 0) {
            return false;
        }
        int n = 1;
        while (n <= num) {
            n *= 2;
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (powerOfTwo(num)) {
            System.out.println("Yes it a power of two number");
        } else {
            System.out.println("No it is not a power of two number");
        }
    }

}