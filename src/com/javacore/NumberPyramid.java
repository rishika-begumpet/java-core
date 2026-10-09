package com.javacore;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sequence = 0;
        for (int i = 1; i <= number; i++){
            //Printing the spaces between the rows
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            // Printing the numbers
            for(int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

