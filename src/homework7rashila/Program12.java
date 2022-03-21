package homework7rashila;

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the input : ");
        char ch = scr.next().charAt(0);

        if ((ch >+ 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("This is an Alphabet ");
        }else if (ch >+ '0' && ch <= '9'){
            System.out.println("This is a Number ");
        }else{
            System.out.println("This is a Special Character");
        }

        }
    }

