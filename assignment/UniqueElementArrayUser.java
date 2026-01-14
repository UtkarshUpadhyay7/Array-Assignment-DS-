package assignment;
import java.util.Scanner;

public class UniqueElementArrayUser {

    public static void main(String[] args) {

    	// 1] Creating an Scanner Class
        Scanner sc = new Scanner(System.in);

        // 2] Taking input as size
        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();

        // 3] Initialize the array
        int arr[] = new int[size];

        // 4] Initial Condition
        boolean is_unique = true;

        // 5] Taking array elements as input
        System.out.println("Enter the array elements ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        
         // 6] Main Logic for comparing
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    is_unique = false;
                    break;
                }
            }

        }
                // 7] To display  output 
        if(is_unique) {
            System.out.println("Array is unique");
        } else {
            System.out.println("Array is not unique");
        }

        sc.close();
    }
}
