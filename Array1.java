//Coding Challenge 1:
//Problem Statement:
// Given an integer array and a number X, check whether X is present in the array.

package assignment;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner class
		
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking size as input
		
		System.out.println("Enter the size");
		int num = sc.nextInt();
		
		// 3] Initialize the array  from users
		
		System.out.println("Enter the array elements");
		int arr[]= new int[num];
		
	
		//4] For loop --  taking input
		
			for(int i=0;i<num;i++) {
			arr[i]= sc.nextInt();
		}
		
		// 5] Searching logic -- elements which we would  find
		System.out.println("Enter the value of finding element");
		int x = sc.nextInt();
		
		// 6] Intial condition
		boolean found = false;
		
		// 7] For loop --- output
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==x) {
				found = true;
				 break;
			}		
		}
		
		// 8] print output 
		if(found == true) {
			System.out.println("Element found" );
		}
		else {
			System.out.println("Element not found");
		}
		
		sc.close();
		
	}

}
