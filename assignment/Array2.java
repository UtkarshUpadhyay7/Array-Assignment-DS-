package assignment;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

    	// 1] Creating an Scanner class
        Scanner sc = new Scanner(System.in);

        // 2] taking input for the integer
        System.out.println("Enter how many numbers:");
        int n = sc.nextInt();

        // 3] Creating an an array and taking input
        int[] array = new int[n];
 
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); // Initializing the scanner class of an array 
        }

        int even_count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {   
                even_count++;
            }
        }

        System.out.println("Even Numbers = " + even_count);

        sc.close();
    }
}
