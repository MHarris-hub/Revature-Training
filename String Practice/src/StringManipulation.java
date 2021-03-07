//Michael Harris
//String Practice

import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String text = scanner.nextLine();

		System.out.println("The vowel count is: " + vowelCount(text));
		
		if (allVowels(text))
			System.out.println("ALL vowels are present.");
		else
			System.out.println("NOT all vowels are present.");
		
		System.out.println("Characters with prime indices converted to uppercase: " + toUpperCasePrime(text));
	}

	//count the number of vowels in a given string
	private static int vowelCount(String text) {
		int count = 0;

		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) == 'a' ||
				text.charAt(i) == 'e' ||
				text.charAt(i) == 'i' ||
				text.charAt(i) == 'o' ||
				text.charAt(i) == 'u')
					count++;

//		//alternate method of calculating the count
//		count = text.replaceAll("[^aeiou]", "").length();

		return count;
	}

	//return true if all vowels are present in a given string
	private static boolean allVowels(String text) {
		//flags for the presence of each vowel - indices: a = 0, e = 1, i = 2, o = 3, u = 4
		boolean[] vowels = {false, false, false, false, false};

		text = text.toLowerCase();

		//flag each of the present vowels
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) == 'a')
				vowels[0] = true;
			else if(text.charAt(i) == 'e')
				vowels[1] = true;
			else if(text.charAt(i) == 'i')
				vowels[2] = true;
			else if(text.charAt(i) == 'o')
				vowels[3] = true;
			else if(text.charAt(i) == 'u')
				vowels[4] = true;

		//return false if all vowels are not all present
		for (int i = 0; i < vowels.length; i++)
			if (!vowels[i])
				return false;

		return true;
	}

	//return a string where each of the characters with prime indices are uppercase
	private static String toUpperCasePrime(String text) {
		String modifiedText = "";

		for (int i = 0; i < text.length(); i++)
			if (isPrime(i))
				modifiedText += Character.toUpperCase(text.charAt(i));
			else
				modifiedText += text.charAt(i);

		return modifiedText;
	}

	//determine if a given integer is prime
	private static boolean isPrime(int num) {

		//0 and 1 are not prime numbers
		if (num == 0 || num == 1)
			return false;
		else
			for (int i = 2; i < num; i++)
				if (num % i == 0)
					return false;

		return true;
	}
}