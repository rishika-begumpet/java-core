package com.javacore;
import  java.util.Scanner;
public class SkipCertainNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Special");
            }else  if(i % 3 == 0){
                continue;
            }else if(i % 5 == 0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
