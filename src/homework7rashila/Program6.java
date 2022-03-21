package homework7rashila;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6 {

        public static void main(String[] args) {

            Scanner obj = new Scanner(System.in); //create scanner

            System.out.println("Enter any number : " ); // enter number in console

            int num = obj.nextInt();

            String Program1 = (num % 2 == 0) ? "even" : "odd";

            System.out.println(num + " is " + Program1);

        }
    }
