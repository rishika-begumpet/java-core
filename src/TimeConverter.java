import java.util.Scanner;

public class TimeConverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the seconds : ");
        int seconds =  input.nextInt();
        int minute = 60;
        int hour = 3600;
        int total_hour = seconds / hour;
        int remaining = seconds % hour;
        int total_minute = remaining / minute;
        int remaining_second = remaining % minute;
        int total_second = remaining_second;

        System.out.println("Hour:" + total_hour +"hr" + " " + "Minutes:" + total_minute + "min" + " " + "Seconds:" + total_second + "s");
    }
}
