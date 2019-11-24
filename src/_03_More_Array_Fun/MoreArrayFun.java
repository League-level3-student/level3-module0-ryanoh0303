package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	public static void Method(String[] arr){
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void Reverse(String[] arr) {
		for(int i=arr.length;  i>0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void every(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void RandomOrder(String[] arr) {
		Random rand= new Random();
		int x= rand.nextInt(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[x]);
			x= rand.nextInt(arr.length);
		}
	}
	
	
}
