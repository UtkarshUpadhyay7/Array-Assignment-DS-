//Challenge 1: Count Positive, Negative and Zero Elements
//Problem Statement
//You are given an array of integers representing daily profit and loss values.
// Write a Java program to count:
package assignment;

public class PostiveNegativeZeroArray {

	public static void main(String[] args) {
	
		// 1] Initialize the array 
		int array [] = {4 , 5 , 0, -9 ,5,-7,0};
		int count_postive=0;
		int count_negative = 0;
		int count_zero=0;
		
		for(int i=0 ;i<array.length;i++) {
			if(array[i]>0) {
				count_postive++;
			}
            if(array[i]<0) {
				count_negative++;
			}
			if(array[i]==0) {
				count_zero++;
			}
		}
		System.out.println("The numbers  of count of  postive numbers is " +count_postive);
		System.out.println("The numbers of count of  negative numbers is " +count_negative);
		System.out.println("The count of the zero numbers is " +count_zero);
		

	}

}
