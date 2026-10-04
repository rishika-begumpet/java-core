package com.javacore;
import java.util.Scanner;
public class CountingZerosUsingBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  sc.nextInt();
        int digit =0;
        int original = number;
        int count = 0;
        boolean isZero = false;
        while(number != 0){
            digit = number % 10;
            number = number / 10;
            if(digit == 0){
                isZero = true;
                count++;
            }
        }if(isZero){
            System.out.println(original + " contaning zero ");
            System.out.println(count + " " + "zeros");
        }else{
            System.out.println(original + " is not contaning zero ");
        }
    }
}
