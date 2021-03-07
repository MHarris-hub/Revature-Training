//Michael Harris
//Array Practice Assignment

import java.util.Arrays;

public class crudArray {
	public static void main(String[] args) {
		//---CREATE---
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("The starting array is: ");
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		//---READ---
		System.out.println("The third element of the array is: " + numbers[2]);
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		//---UPDATE---
		numbers[2] = 7000;
		System.out.println("The third element of the array has been updated to: " + numbers[2]);
		System.out.println(Arrays.toString(numbers));
		System.out.println();

		//---DELETE---
		//new array to receive the old array with the specified element removes
		int[] newNumbers = new int[numbers.length - 1];
		//index of the element to remove
		int j = 2;
		//new index needed for updating new array 
		int k = 0;

		//copy old array to new array, removing the specified element
		for (int i = 0; i < numbers.length; i++)
			if (i != j) {
				newNumbers[k] = numbers[i];
				k++;
			}

		System.out.println("The third element of the array has been removed.");
		System.out.println(Arrays.toString(newNumbers));
	}
}