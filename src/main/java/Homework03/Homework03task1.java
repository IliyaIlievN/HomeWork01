package Homework03;
/*
        Напишете програма/ метод, която приема от конзолата 3 подадени числа определя
        кое е най-голяматo.
*/
import java.util.Scanner;
public class Homework03task1 {
    public static void main(String[] args){

        int a, b, c;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter the first number:");
        a = scanner.nextInt();
        System.out.println("Please enter the second number:");
        b = scanner.nextInt();
        System.out.println("Please enter the third number:");
        c = scanner.nextInt();

        int largest = Math.max(c, (Math.max(a, b)));
        System.out.println("The largest number is: " +largest);
    }
}
