package com.javacore;
import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number1 =  sc.nextInt();
        System.out.println("Enter the number2");
        int number2 = sc.nextInt();
        System.out.println("Enter the number3");
        int number3 = sc.nextInt();
        System.out.println("Enter the operation to perform");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(number1 + number2+number3);
                break;
                case '-':
                    System.out.println(number1 - number2 -number3);
                    break;
                    case '*':
                        System.out.println(number1 * number2*number3);
                        break;
                        case '/':
                            System.out.println(number1 / number2/number3);
                            break;
                            case '%':
                                System.out.println(number1 % number2 %number3);
                                break;
        }
    }
}
