package com.javacore;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i <= number-1; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }if(isPrime){
            System.out.println("Number is a Prime");
        }else{
            System.out.println("Number is not  a Prime");
        }
    }
}
