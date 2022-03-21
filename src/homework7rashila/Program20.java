package homework7rashila;

//20. Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Program20 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // call scanner
        System.out.print("Input a number: "); //call in console
        int Num = input.nextInt(); // input number

        int[] value = {1, 12, 3, 60, 5, 6, 20, 8, 35, 10};

        int i = 0;

        for (i = 0; i < value.length; i++) {
            if (value[i] == Num) {
                System.out.print("\nYes, " + Num + " is present.");
                break;
            }
        }
        if ((value.length) - i == 0) {
            System.out.print("\nNo, " + Num + " is not present.");
        }
    }
}

