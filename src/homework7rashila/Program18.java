package homework7rashila;
//18. Write a Java program to sum values of an array.

import java.util.Scanner;

public class Program18 {


    public static void main(String[] args) {// main method
        int a, sum = 0; //local variable
        Scanner scr = new Scanner(System.in); //create scanner
        System.out.println("Enter no. of elements you want in the array:");
        a = scr.nextInt();

        int n[] = new int[a];
        System.out.println("Enter all the elements : ");
        for (int i = 0; i < a; i++){

            n [i] = scr.nextInt();
            sum = sum + n[i];
        }
        System.out.println("sum:" + sum);

    }


}

