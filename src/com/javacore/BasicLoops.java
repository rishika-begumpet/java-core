package com.javacore;
import java.util.Scanner;

public class BasicLoops {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        // Using for loop printing numbers from 50 to 1

        /* for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }
       */

        // Using the for and if for even and odd numbers

        /*for(int i = 1; i<=100;i++){
            if(i%2==0){
                System.out.println(i + " " + "Even");
            }else {
                System.out.println(i + " " + "odd");
            }
        }
        */

        // Multiplication Table
        /*
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        for( int i=1; i<=10;i++){
            System.out.println(number + "*" + i  + "=" + (number * i));
        }
        */
    }
}

