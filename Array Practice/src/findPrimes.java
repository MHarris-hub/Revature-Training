//Michael Harris
//Array Practice Assignment

import java.util.Scanner;

public class findPrimes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements (array size): ");
		int n = sc.nextInt();

		int[] numbers = new int[n];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
			numbers[i] = sc.nextInt();

		System.out.println("The prime elements are: ");
		for (int element : numbers)
			if (isPrime(element))
				System.out.println(element);
	}
	
	//determine if a given integer is prime
	private static boolean isPrime(int num) {
		
		//return false if num is 1 since 1 is not a prime number
		if (num == 1)
			return false;
		else
			for (int i = 2; i < num; i++)
				if (num % i == 0)
					return false;
			
		return true;
	}
}