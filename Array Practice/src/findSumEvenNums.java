//Michael Harris
//Array Practice Assignment

import java.util.Scanner;

public class findSumEvenNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements (array size): ");
		int n = sc.nextInt();

		int numbers[] = new int[n];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
			numbers[i] = sc.nextInt();

		System.out.println("The sum of the even elements in the array is: ");
		System.out.println(sumEvenNums(numbers));
	}

	//calculate the sum of all even numbers in the given array
	private static int sumEvenNums(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] % 2 == 0)
				sum += numbers[i];

		return sum;
	}
}