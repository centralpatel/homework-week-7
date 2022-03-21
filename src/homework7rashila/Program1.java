package homework7rashila;
/*1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Program1 {

   public static void main(String[] args) { // main method
//
//        Scanner obj = new Scanner(System.in);
//
//        System.out.println("Enter any number : " ); //input any number
//
//        int num = obj.nextInt(); //import in console
//
//        String Program1 = (num % 2 == 0) ? "even" : "odd";//
//
//        System.out.println(num + " is " + Program1); //calling into console

    Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number"); //input any number
    int number = scan.nextInt();

		scan.close();

    //ternary operator to check number
    String result = number%2==0 ? "Even" : "Odd";

		System.out.println(number +" is "+ result);


    }
}
