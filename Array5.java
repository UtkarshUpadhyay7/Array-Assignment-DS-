//Problem Statement:
// Find the maximum sum of consecutive elements in the array.
package assignment;
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
		
		// 1] creating an Scanner Class
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking the size of an array
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		// 3] Initialize the array  from an user
		int arr[] = new int[size];
		
		
		// 4] Taking the array elements using the for loop
		
		System.out.println("Enter the array elements");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt(); 
		}

		// 5] Initial  condition
		
		int con_sum = 0;
		
		// 6] Main logic for output
		
		for(int i=0;i<size;i++) {
		       con_sum  = arr[i]+con_sum;
		}
		
		System.out.println(con_sum);
		
		sc.close();
	}

}
