package com.javacore;
import java.util.Scanner;
public class BooleanNumberContaining0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number ;
        int digit = 0;
        int num = 0;
        boolean isZero = false;
        while(number != 0 ){
            digit = number % 10;
            number = number / 10;
            num = digit;
            if(num == 0){
                isZero = true;
                break;
            }
        }
        if(isZero){
            System.out.println(original+" is Containg Zero");
        }else {
            System.out.println(original+" is not Containg Zero");
        }
    }
}
