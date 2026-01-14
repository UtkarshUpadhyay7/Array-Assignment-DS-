package assignment;


public class Arra1 {

	public static void main(String[] args) {

   // 1] Initialize the array 
	int arr []= {75,30,80,90,45};
	int total=0;
	
	
	//2] Condition
	for(int i=0;i<arr.length;i++) {
		total= total +arr[i];
		
	}
	System.out.print(total);
		
	}
}
