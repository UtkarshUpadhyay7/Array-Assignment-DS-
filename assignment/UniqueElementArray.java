// Challenge 2: Check if All Elements Are Unique
//Problem Statement
//Given an array of integers, check whether all elements are unique.
// If any element repeats, print NO, otherwise print YES.
package assignment;

public class UniqueElementArray {

	public static void main(String[] args) {
		
		// 1] Initialize the array 
		int arr [] = {5,6,7,6,9};
		boolean unique = true;

		// 2] Main Logic
		
		// Outer Loop -- 
		for(int i=0 ; i<arr.length ; i++) { 
			// Inner Loop --
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
					unique = false;
					break;
				}
			}
			}
		
		// 3 ] To Display output 
		if(unique) {
			System.out.println("The Element in an array is unique");
		}
		else {
			System.out.println("The number in an array is repeated");
		}
	}

}
