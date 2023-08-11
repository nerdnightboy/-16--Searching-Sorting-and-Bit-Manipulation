/*
 * Given a number, count the number of set bits in that number without using an extra space. Note : bit ‘1’ is also known as set bit.
 */

import java.util.Scanner;

public class NumberSys4 {
    public static int countSetBit(int num){
        int count = 0;
        while(num > 0){
            count = count + (num & 1);
            num >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Total number of set bits are : " + countSetBit(num));
    }
}
