import java.util.Scanner;

public class Enumeration {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        // Method to check if the day is a workday (Monday to Friday)
        public boolean isWorkday() {
            return (this != SATURDAY && this != SUNDAY);
        }
    }

    public static void main(String[] args) {
        // Check if Monday is a workday
        System.out.println("Is Monday a workday? " + DayOfWeek.MONDAY.isWorkday());

        // Check if Saturday is a workday
        System.out.println("Is Saturday a workday? " + DayOfWeek.SATURDAY.isWorkday());
    }
}
