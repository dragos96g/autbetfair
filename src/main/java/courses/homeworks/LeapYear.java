package courses.homeworks;

import java.util.Scanner;

public class LeapYear {

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a year between 1900 and 2016: ");

            int year = scanner.nextInt();

            if (year >= 1900 && year <= 2016) {
                if (isLeapYear(year)) {
                    System.out.println("February of the year " + year + " had 29 days");
                } else {
                    System.out.println("February of the year " + year + " had 28 days");
                }
            } else {
                System.out.println("The year is not between 1900 and 2016.");
            }
            scanner.close();
        }
}
