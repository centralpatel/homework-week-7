package homework7rashila;
//2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) { // main method

        int year; // int data

        Scanner obj = new Scanner(System.in); // call Scanner
        System.out.print("Enter any Year: "); // enter data in console
        year = obj.nextInt();
        obj.close();

        if((year%400==0)|| (year%4==0 && year%100 != 0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }


}



