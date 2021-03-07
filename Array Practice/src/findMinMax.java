//Michael Harris
//Array Practice Assignment

import java.util.Scanner;
import java.util.Arrays;

public class findMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements (array size): ");
		int n = sc.nextInt();

		int numbers[] = new int[n];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
			numbers[i] = sc.nextInt();
		
		Arrays.sort(numbers);
		
		System.out.println("The MIN element of the array is: ");
		System.out.println(numbers[0]);
		
		System.out.println("The MAX element of the array is: ");
		System.out.println(numbers[numbers.length - 1]);
		
		System.out.println("The SECOND MAX element of the array is: ");
		System.out.println(numbers[numbers.length - 2]);
	}
}