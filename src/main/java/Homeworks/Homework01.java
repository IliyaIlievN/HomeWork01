//location of the current class
package Homeworks;
/*
Чете за име на потребител

Чете за любимо хоби на потребителя

Изписва в конзолата подходящо съобщение за потребителя и хобито
 */
//When we want to use something built-in we shall import it
import java.util.Scanner;

//definition of a class
public class Homework01 {
    //main method :) (entry point i.e. starting point of execution of our program)
    public static void main(String[] args) {

        //Working with the standard output so-called Console - printing some text
        System.out.println("Please put in your name:");
        //Class Scanner - giving us the possibility to work with standard input (from the Console)
        Scanner scanner = new Scanner(System.in);
        //Creating a variable (userName) which will hold a text value(the name)
        String userName = scanner.nextLine();
        //using substring and toUpperCase so first letter is no matter the string input capital
        userName = userName.substring(0,1).toUpperCase() + userName.substring(1).toLowerCase();

        //Working with the standard output so-called Console - printing some text
        System.out.println("Please put in your hobby:");
        //Class Scanner - giving us the possibility to work with standard input (from the Console)
        scanner = new Scanner(System.in);
        //Creating a variable (userHobby) which will hold a text value(the name)
        String userHobby = scanner.nextLine();
        //using substring and toUpperCase so first letter is no matter the string input capital
        userHobby = userHobby.substring(0,1).toUpperCase() + userHobby.substring(1).toLowerCase();

        //Working with the standard output so-called Console - printing some text
        System.out.println("Hello " + userName + ", nice to meet you! " +
                userHobby + " is a hobby of mine also. It is a lot of fun, enjoy it!");
    }
}