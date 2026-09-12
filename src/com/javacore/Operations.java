package com.javacore;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Telugu Marks : ");
        int telugu_marks = sc.nextInt();
        System.out.println("Enter Hindi Marks : ");
        int hindi_marks = sc.nextInt();
        System.out.println("Enter English Marks : ");
        int english_marks = sc.nextInt();
        int total_marks = telugu_marks + hindi_marks + english_marks;
        System.out.println( "Total Marks are :" + total_marks);
        int average_marks = total_marks/3;
        System.out.println("Average marks are :" + average_marks);
        // if you want the average marks in points
        System.out.println("Average Marks in decimal:" + (float)average_marks);

        //Ḥow Datatypes work with operations

        //byte + byte always gives integer as a result
        byte a = 10;
        byte b = 20;
        System.out.println( "byte + byte : " + a+b);
       //byte + short always gives int
        byte a1 = 10;
        short b1 = 20000;
        System.out.println("byte + short :" + a1+b1);
       //byte + long gives  long datatype as a result
        byte a2 = 10;
        long b2 = 20000000000000L;
        System.out.println( "byte + long : " + a2+b2);
       //short + short always gives an integer
        short a3 = 20000;
        short b3 = 20000;
        System.out.println( "short + short :" + a3+b3);
       //int + long always long datatype as a result
        int a4 = 100;
        long b4 = 10000000000000L;
        System.out.println("int + long :" + a4+b4);
       //float + int always gives a float
        float a5 = 32.6f;
        int b5 = 100;
        System.out.println("float + int :" + a5+b5);
       //long + float always gives a float
        long a6 = 20000000000000L;
        float b6 = 333.5f;
        System.out.println("long + float : " + a6+b6);
        //double + float always gives double
       double a7 = 3333.5676;
       float b7 = 33.5f;
       System.out.println("double + float : " + a7+b7);
    }
}
