package homework7rashila;

import java.util.Scanner;

//19. Write a Java program to calculate the average value of array elements.
public class Program19 {

    public static void main(String[] args) {
        //reads the array size
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = scr.nextInt();

        // create an array
        int[] array = new int[size];

        //reads the value from user keyboard
        System.out.println("Enter array values : ");
        for (int i = 0; i < size; i++) {
            int value = scr.nextInt();
            array[i] = value;
        }
        //getting array length
        int length = array.length;

        //default sum value
        int sum = 0;

        //sum of all value in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array : " + average);
    }
}
