package com.javacore;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a :");
int a = sc.nextInt();
        System.out.println("Enter value b :");
int b = sc.nextInt();
a = a + b ;
b = a - b;
a = a - b;
System.out.println("Value of a: " + a);
System.out.println("Value of b:" + b);
    }
}

