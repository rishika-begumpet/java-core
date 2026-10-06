package com.javacore;
import java.util.Scanner;
public class NumberContainsSingleZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =  sc.nextInt();
        int digit = 0;
        int count = 0;
        boolean isContains = false;
        while(number!=0) {
            digit = number % 10;
            number /= 10;
            if (digit == 0) {
                count++;
            }
        }if (count == 1) {
            isContains = true;
        }else {
            isContains = false;
        }if(isContains){
                System.out.println("Contains a single zero");
                System.out.println(count);
            }else if(count >= 2) {
                System.out.println("Contains more than single zero");
            }else {
                System.out.println("Not Contains a single zero");
            }
        }
}
