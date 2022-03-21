package homework7rashila;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        double BasicSalary, HRA, DA, TA, PF, Gross;
        Scanner scr = new Scanner(System.in);


        // input Employee Id
        System.out.println("Input Employee Id: ");
        int Id = scr.nextInt();
        //input the Employee name
        System.out.println("Input Employee name: ");
        String Name = scr.next();
        //Input Employee basic salary
        System.out.println("Input Employee Basic Salary: ");
        float Salary = scr.nextFloat();


        HRA = 10 * Salary / 100;
        DA = 8 * Salary / 100;
        TA = 9 * Salary / 100;
        PF = -20 * Salary / 100;
        Gross = Salary + HRA + DA + TA - (-PF);

        System.out.println("Basic Salary = " + Salary);
        System.out.println("HRA 10% = " + HRA);
        System.out.println("DA 8% = " + DA);
        System.out.println("TA 9% = " + TA);
        System.out.println("PF -20& = " + PF);
        System.out.println("Gross Salary = " + Gross);


        //Display Data
        System.out.println();
        System.out.println("|----------------------------------------|");
        System.out.println("|               Salary Slip              |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Employee Id      :   " +Id+"              |");
        System.out.println("| Employee Name    :   " +Name+ "           |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Basic Salary     :   " +Salary+ "           |");
        System.out.println("| HRA 10%          :   "+HRA+"            |");
        System.out.println("| TA 8%            :   "+TA+"            |");
        System.out.println("| DA 9%            :   "+DA+"            |");
        System.out.println("| PF -20&          :   "+PF+"           |");
        System.out.println("|________________________________________|");
        System.out.println("| Gross Salary     :   "+Gross+"           |");
        System.out.println("|________________________________________|");
    }
}
