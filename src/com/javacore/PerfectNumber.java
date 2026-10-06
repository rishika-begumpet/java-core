package com.javacore;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int digit = 0;
        int num = 0;
        int sum = 0;
for (int i = 1; i <= number - 1; i++) {
        if (number % i == 0) {
            sum += i;
        }
}
if(sum == number){
    System.out.println("Perfect Number");
}else {
System.out.println("Not Perfect Number");
}
    }
}