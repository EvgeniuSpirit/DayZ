import java.util.Scanner;

public class DayZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Пьем 12.09." + year);
        } else {
            System.out.println("Пьем 13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
