package assignment;
import java.util.Scanner;

public class PostiveNegativeZeroArrayUser {

	public static void main(String[] args) {
	
		// 1] Creating an Scanner class
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking the array size 
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		// 3] Initialize the array 
		int  array [] = new int [size];
		
		// 4] Taking input -- Array Elements 
		System.out.println("Enter the array elemets !");
		for(int i=0 ; i<array.length ; i++) {
			array[i]=sc.nextInt();
		}

		// 5]  To find !!
		int postive_count = 0;
		int negative_count = 0;
		int zero_count = 0;
		
		// 6] Main logic --- 
		for(int i = 0 ;i<array.length ; i++) {
			if(array[i]>0) {
				postive_count++;
			}
			if(array[i]<0) {
				negative_count++;
			}
			if(array[i] == 0) {
				zero_count++;
			}
			
		}
		System.out.println("The count of postive numbers is " +postive_count);
		System.out.println("The count of negative numbers is " +negative_count);
		System.out.println("The count of zero numbers is " +zero_count);
		
		sc.close();
	}

}
