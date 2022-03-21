package homework7rashila;

//17. Write a Java program to sort a numeric array and a string array
import java.util.Arrays;

public class Program17 {

    public static void main(String[] args) {

        int[] arraydata1 = {100, 80, 50, 30, 40, 60, 20, 70, 90, 10};// numeric array
        String[] arraydata2 = {"Apple", "Banana", "Starfruit", "Jackfruit", "Sugarcane", "Blueberries"};//string array
        System.out.println("Original Value: " + Arrays.toString(arraydata1)); //print statement for numeric array
        Arrays.sort(arraydata1);// sorting array
        System.out.println("Sorted Value: " + Arrays.toString(arraydata1));
        System.out.println();
        System.out.println("Original Value: " + Arrays.toString(arraydata2));//print statement for string array
        Arrays.sort(arraydata2);
        System.out.println("Sorted Value: " + Arrays.toString(arraydata2));

    }


}