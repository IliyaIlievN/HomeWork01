package Homework03;
/*
        Напишете програма/ метод, която чете число и изписва в конзолата
        дали числото е четно или не?
*/
import java.util.Scanner;
public class Homework03task3 {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter a number: ");
        a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println("The number is even.");
        }
        else System.out.println("Tne number is uneven.");

    }
}
