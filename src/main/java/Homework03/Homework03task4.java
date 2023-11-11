package Homework03;
/*
Напишете програма/ метод, която чете число от 1 до 12 в конзолата и на базата
на това изписва в конзолата месец от годината във формат:
You have selected 1. Month of the year is Monday.
 */
import java.util.Scanner;
public class Homework03task4 {
    public static void main(String[] args){
        int month;
        try (Scanner months = new Scanner(System.in)) {

            System.out.println("Put in a number:");
            month = months.nextInt();
        }
        System.out.println(getMonth(month));
    }

    public static String getMonth(int month){
        return switch (month) {
            case 1 -> "You have selected 1. Month of the year - January";
            case 2 -> "You have selected 2. Month of the year - February";
            case 3 -> "You have selected 3. Month of the year - March";
            case 4 -> "You have selected 4. Month of the year - April";
            case 5 -> "You have selected 5. Month of the year - Mai";
            case 6 -> "You have selected 6. Month of the year - June";
            case 7 -> "You have selected 7. Month of the year - Juli";
            case 8 -> "You have selected 8. Month of the year - August";
            case 9 -> "You have selected 9. Month of the year - September";
            case 10 -> "You have selected 10. Month of the year - October";
            case 11 -> "You have selected 11. Month of the year - November";
            case 12 -> "You have selected 12. Month of the year - December";
            default -> "Invalid";
        };
    }
}
