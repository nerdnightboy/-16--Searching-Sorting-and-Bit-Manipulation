/*
* given a number, print its binary representation. [easy]
Input 1: number = 5
Output 1: 101
Input 2: number = 10
Output 2: 1010
 */


import java.util.Scanner;
import java.lang.*;

public class NumberSysQues1 {
    public static String toCovertBinary(int num){
        StringBuilder res = new StringBuilder();
        if (num == 0) {
            return "0";
        }

        while(num > 0){
            int bit = num % 2;
            res.insert(0, bit);
            num = num/2;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The Bianry number is : " + toCovertBinary(num));
    }
}
