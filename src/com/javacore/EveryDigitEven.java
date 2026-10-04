package com.javacore;
import java.util.Scanner;
public class EveryDigitEven {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int digit = 0;
        int original  = number;
        boolean isEven = true;
        while(number!=0){
            digit =  number % 10;
            number = number/10;
            if(digit % 2 != 0){
                isEven = false;
                break;
            }
        }
        if(isEven){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is not Even");
        }
    }
}
