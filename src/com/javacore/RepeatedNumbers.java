package com.javacore;
import java.util.Scanner;
public class RepeatedNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Creating for printing a repeating number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit : ");
        int digit = sc.nextInt();
        int count = 0;
        int repeat = 0;
        while (num != 0) {
            repeat = num % 10;
            num = num / 10;
            if (digit == repeat) {
                count++;
            }
        }
        System.out.println(digit + " " + "is repeated " + count + " " + "times");

    }
}
