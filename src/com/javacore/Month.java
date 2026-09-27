package com.javacore;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        switch (month) {
            case "January":
                System.out.println("Days : 31");
            case "February":
                System.out.println("Days : 28")  ;
                case "March":
                    System.out.println("Days : 31") ;
                    case "April":
                        System.out.println("Days : 30") ;
                        case "May":
                            System.out.println("Days : 31") ;
                                    break;
                            case "June":
                                System.out.println("Days : 31");
                                case "July":
                                    System.out.println("Days : 30") ;
                                    break;
                                    case "August":
                                        System.out.println("Days : 31");
                                        break;
                                        case "September":
                                            System.out.println("Days : 30") ;
                                            break;
                                      case "October":
                                       System.out.println("Day 31");
                                       break;
                                      case "November":
                                        System.out.println("Days : 31");
                                            break;
                                     case "December":
                                        System.out.println("Days : 31");
                                           break;
        }
    }
}
