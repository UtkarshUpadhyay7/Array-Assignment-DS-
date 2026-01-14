//Problem Statement:
// Find the second largest distinct element in the array.
package assignment;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		
		//1] Creating an Scanner class
		Scanner sc = new Scanner(System.in);
		
		// 2] Entering the size of an array
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		// 3] Initiliaze the array
		int arr []	= new int[size];
		
		
		// 4] for loop to take input
		
		System.out.println("Enter the Array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		// 5] Maximum element condition
		int max =arr[0];
		int second_max =arr[0];
		
		// 6] For loop to take output
		
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				second_max= max;
				max=arr[i];
			}
			else  if(arr[i] >second_max  && arr[i] != max) {
				second_max = arr[i];
			}
		}
		System.out.println("Second largest Element is " +second_max);
		sc.close();
   }
	

}
