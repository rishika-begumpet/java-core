import java.util.Scanner;

public class FindingDay {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     String day = sc.nextLine();
     switch(day){
         case "Monday":
             System.out.println("Weekday");
             break;
             case "Tuesday":
                 System.out.println("Weekday");
                 break;
                 case "Wednesday":
                     System.out.println("Weekday");
                     break;
                     case "Thursday":
                         System.out.println("Weekday");
                         break;
                         case "Friday":
                             System.out.println("Weekday");
                             break;
                             case "Saturday":
                                 System.out.println("Weekend");
                                 break;
                                 case "Sunday":
                                     System.out.println("Weekend");
                                     break;
     }

    }
}
