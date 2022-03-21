package homework7rashila;

import java.util.Scanner;

/*Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
(marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50
B, %> = 35 C
And print Mark Sheet in following format
 */
public class Program3 {
    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);
// input the name of the student
        System.out.println("Input Name: ");
        String name = marks.next();
        //input the roll number of teh student
        System.out.println("Input roll number: ");
        int roll = marks.nextInt();
        //input subject results
        System.out.println("Input Marks for Math");
        double Math = marks.nextDouble();
        //error handling
        if (Math > 100 || Math < 0) {
            System.out.println("Invalid input, Marks should be between 0 and 100");
        }
            //Science
            System.out.println("Input Marks for Science");
            double Science = marks.nextDouble();
            //error handling
            if (Science > 100 || Science < 0) {
                System.out.println("Invalid input, Marks should be between 0 and 100");
                // English
            }
                System.out.println("Input Marks for English");
                double English = marks.nextDouble();
                //error handling
                if (English > 100 || English < 0) {
                    System.out.println("Invalid input, Marks should be between 0 and 100");
                }

                double total = Math + Science + English;
                double percentage = total / 3;

                //Grading
        //boolean IsPass;
        String Result = "0";
        if (percentage >= 35){
            Result = "Pass";
        }else {
            Result = "Fail";
        }

        //Grade
        String Grade = "0";
        if (percentage >= 80){ // Value of grade should be A+ if percentage if over 80
            Grade = "A+";
        }else if (percentage >= 60){ // Value of grade should be A if percentage if over 60
            Grade = "A";
        }else if (percentage >= 50){ // Value of grade should be B if percentage if over 50
            Grade = "B";
        }else if (percentage >= 35){ //// Value of grade should be C if percentage if over 35
            Grade = "C";
        }

        // Display the Data
        System.out.println("|-----------------------------------|");
        System.out.println("|              Mark Sheet           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|    Name        :  "+name+"         |");
        System.out.println("|    Role No.    :  "+roll+"               |");
        System.out.println("|-----------------------------------|");
        System.out.println("|    Subjects    :  "+"Marks           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|    Math        :  "  +Math+"            |");
        System.out.println("|    Science     :  "  +Science+"            |");
        System.out.println("|    English     :  "  +English+"            |");
        System.out.println("|-----------------------------------|");
        System.out.println("|    Total       :  "   +total+"           |");
        System.out.println("|-----------------------------------|");
        System.out.println("|    Percentage  :  "   +percentage+"            |");
        System.out.println("|    Result      :  "   +Result+"            |");
        System.out.println("|    Grade       :  "   +Grade+"              |");
        System.out.println("|-----------------------------------|");


            }
        }