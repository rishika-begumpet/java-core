package com.javacore;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("The age is " + age);
        System.out.println("Enter your grade");
        char grade;
        grade = sc.next().charAt(0);
        System.out.println("The grade is " + grade);
        System.out.println("Enter your percentage");
        double percentage;
        percentage = sc.nextDouble();
        System.out.println("The percentage is " + percentage);
        System.out.println("Enter are you enrolled?");
        boolean isEnrolled = sc.nextBoolean();
        System.out.println("The enrolled status is " + isEnrolled);

 // Finding Area of a Circle
        System.out.println("Enter Radius");
        double radius = sc.nextDouble();
        System.out.println("The radius is " + radius);
        System.out.println("Enter Area");
      double Area ;
      Area = 3.14*radius*radius;
      System.out.println("The area is " + Area);
      System.out.println("Enter Circumference");
      double Circumference;
      Circumference =  2 * (3.14)*radius;
      System.out.println("The circumference is " + Circumference);

 // Salary Calculator
        System.out.println("Enter your Salary : ");
 int salary;
  salary = sc.nextInt();
  System.out.println("The HRA is ");
  float HRA ;
  System.out.println("Enter the percentage : ");
 float HRApercentage = sc.nextFloat();
        HRA = 20000 * HRApercentage / 100;
  float Tax;
  System.out.println("The tax percentage is ");
 float tax_percentage = sc.nextFloat();
 Tax = 20000* tax_percentage / 100;
 double gross_salary = salary + HRA ;
       double net_salary = gross_salary - Tax ;
        System.out.println("Salary is "+ salary);
        System.out.println("Tax is "+ Tax);
       System.out.println("Net salary is "+ net_salary);
       System.out.println("House Rent is "+ HRA);
       System.out.println("Gross Salary" + " " +gross_salary);
    }
}
