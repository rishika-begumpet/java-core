package com.javacore;
import java.util.Scanner;
public class NumberPatternReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sequence = 0;
        for(int i = number; i >= 1;i--){
            sequence = sequence*10 + i;
            System.out.println(sequence);
        }
    }
}
