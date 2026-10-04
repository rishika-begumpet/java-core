package com.javacore;
import java.util.Scanner;
public class BooleanPositiveOrNegative {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        boolean isPositive = false;
       if(a>0){
           isPositive=true;
           System.out.println("Positive");
       }else{
           System.out.println("Negative");
       }
}
}
