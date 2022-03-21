package homework7rashila;
//16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) { // main method

        Scanner scr = new Scanner(System.in); // create scanners
        System.out.println("Enter the number : "); // enter number in console
        int num = scr.nextInt(); // call scanner

        if(num > 0){
            System.out.println(num + " is a positive number");
        }else if (num < 0){
            System.out.println(num + " is a negative number");
        }else{
            System.out.println(num + " is Zero");
        }
    }
}
