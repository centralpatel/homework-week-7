package homework7rashila;
/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if any other alphabet should be invalid entry*/
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) { // main method
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F : ");
        ch = scr.next().charAt(0);

        if (ch == 'A' || ch == 'a') {
            System.out.println("A = Aberdeen");
        }else if (ch == 'B'|| ch == 'b'){
            System.out.println("B = Birmingham");
        }else if (ch == 'C'|| ch == 'c'){
            System.out.println("C = Chelthenham");
        }else if (ch == 'D'|| ch == 'd'){
            System.out.println("D = Dunstable");
        }else if (ch == 'E'|| ch == 'e'){
            System.out.println("E = Edinburgh");
        }else if (ch == 'F'|| ch == 'f'){
            System.out.println("F = Feltham");
        }

        else{
            System.out.println("Invalid Alphabet Entered");
        }
    }
}
