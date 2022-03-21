package homework7rashila;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter the alphabet between A to F : ");
        ch = scr.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("A = Aberdeen");
                break;
            case 'B':
                System.out.println("B = Birmingham");
                break;
            case 'C':
                System.out.println("C = Chelthenham");
                break;
            case 'D':
                System.out.println("D = Dunstable");
                break;
            case 'E':
                System.out.println("E = Edinburgh");
                break;
            case 'F':
                System.out.println("F = Feltham");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }

    }
}
