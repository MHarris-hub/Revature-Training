//Michael Harris
//Array Practice Assignment

import java.util.Scanner;

public class findPalindromes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//accept array size from the user
		System.out.println("Enter the number of elements (array size): ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		//accept the individual elements from the user
		System.out.println("Enter the elements in the array (0 < element < 999): ");
		int i = 0;
		while (i < n) {
			numbers[i] = sc.nextInt();
			if (numbers[i] > 0 && numbers[i] < 999)
				i++;
			else
				System.out.println("The element must be between 0 and 999. Enter a new element: ");
		}

		//output the palindromes
		System.out.println("The palindromes are: ");
		for (int element : numbers)
			if (isPalindrome(element))
				System.out.println(element);
	}

	//determine if a three digit, positive integer is a palindrome
	private static boolean isPalindrome(int num) {
		int leftDigit = num / 100;
		int rightDigit = num % 10;
		
		if (leftDigit == rightDigit)
			return true;
		
		return false;
	}
}
