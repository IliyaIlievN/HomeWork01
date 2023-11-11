package Homework03;
/*
Напишете програма/ метод, която за подадени дължина и височина на правоъгълник,
изкарват на конзолата неговият периметър и лице.
*/
import java.util.Scanner;
public class Homework03task2 {
    public static void main(String[] args){
        int a, b;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter the height of the rectangle:");
        a = scanner.nextInt();
        System.out.println("Please enter the width of the rectangle:");
        b = scanner.nextInt();

        System.out.println("The perimeter of the rectangle is " + (a*2+b*2));
        System.out.println("The area of the rectangle is " + a*b);
    }


}
