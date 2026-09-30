package com.javacore;
import java.util.Scanner;
public class Checking0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        int digit = 0;
        boolean containZero = false;
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit == 0) {
                containZero = true;
            }
        } if(containZero) {
            System.out.println("The Number conatins a Zero");
            } else {
                System.out.println("Number does not Contains a 0 ");
            }
    }
}
