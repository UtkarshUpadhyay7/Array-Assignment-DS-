//Coding Challenge 3:
//Problem Statement:
// Find the difference between the maximum and minimum element in the array.
package assignment;
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {

    	
    	// 1] Creating an Scanner Class
        Scanner sc = new Scanner(System.in);

        // 2] Input size from user
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        // 3] Initialize the array
      int[] arr = new int[size];

        // 4] Input elements(for loop)
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 5] Assume first element as max and min
        int max = arr[0];
        int min = arr[0];

        // 6] Find max and min logic 
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 7] Calculate difference 
        int diff = max - min;

        // 8] Output show
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Difference = " + diff);

        sc.close();
    }
}

