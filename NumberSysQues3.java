/*
 * Given a number. Using bit manipulation, check whether it is odd or even. 
Input 1: 8, Even 
Input 2: 3, False
 */

import java.util.Scanner;

public class NumberSysQues3 {
    public static boolean evenOdd(int num) {
        if((num & 1) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (evenOdd(num)) {
            System.out.println("It is a even number.");
        } else {
            System.out.println("It is a odd number.");
        }
    }
}
