package com.javacore;
import java.util.Scanner;
public class StarPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int sequence = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
