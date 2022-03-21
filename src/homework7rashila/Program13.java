package homework7rashila;
/*13. Write a Java program which input any number between 1 to 7 and
it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”*/


import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {// main method
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Day Number : "); // input number in colsole
        int day = scr.nextInt();
        int days; // int data

        switch (day){ // print statements
            case 1: System.out.println("1 = Sunday"); break;
            case 2: System.out.println("2 = Monday"); break;
            case 3: System.out.println("3 = Tuesday"); break;
            case 4: System.out.println("4 = Wednesday"); break;
            case 5: System.out.println("5 = Thursday"); break;
            case 6: System.out.println("6 = Friday"); break;
            case 7: System.out.println("7 = Saturday"); break;

            default:
            System.out.println("Invalid Day number");

        }

    }

}
