//Michael Harris
//String, StringBuilder, StringBuffer Assignment

import java.util.Scanner;

public class StringBuilderBuffer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a sentence: ");
		String input = scanner.nextLine();

		System.out.println("Input after call to lastCharUpper:");
		System.out.println(lastCharUpper(input));
		System.out.println();

		System.out.println("Input after all call to upperEvenOdd:");
		System.out.println(upperEvenOdd(input));
		System.out.println();

		System.out.println("The word with the LEAST number of characters is:");
		System.out.println(minChars(input));
		System.out.println();

		System.out.println("The word with the GREATEST number of characters is:");
		System.out.println(maxChars(input));
		System.out.println();
	}

	//convert the last character of each word in the string to uppercase
	private static String lastCharUpper(String text) {
		String words[] = text.split(" ");	//splits text into array elements using " " as a delimiter
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			//append the word to the stringbuilder (except for the last character)
			sb.append(words[i].substring(0, words[i].length() - 1));
			//convert last character to uppercase
			sb.append(Character.toUpperCase(words[i].charAt(words[i].length() - 1)));
			sb.append(" ");
		}

		return sb.toString().trim();
	}

	//convert to uppercase the first letter of every word with an even number of characters
	//convert to uppercase the middle letter of every words with an odd number of characters
	private static String upperEvenOdd(String text) {
		String words[] = text.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
				sb.append(Character.toUpperCase(words[i].charAt(0)));
				sb.append(words[i].substring(1));
			} else {
				//append the first half, insert the uppercase middle letter, then append the second half of the word
				sb.append(words[i].substring(0, words[i].length() / 2));
				sb.append(Character.toUpperCase(words[i].charAt(words[i].length() / 2)));
				sb.append(words[i].substring(words[i].length() / 2 + 1));
			}

			sb.append(" ");
		}

		return sb.toString().trim();
	}
	
	//returns the first word with the least number of characters
	private static String minChars(String text) {
		String words[] = text.split(" ");

		int min = words[0].length();
		int minIndex = 0;

		for (int i = 1; i < words.length; i++)
			if (words[i].length() < min) {
				min = words[i].length();
				minIndex = i;
			}

		return words[minIndex];
	}

	//returns the first word with the greatest number of characters
	private static String maxChars(String text) {
	String words[] = text.split(" ");

	int max = words[0].length();
	int maxIndex = 0;

	for (int i = 1; i < words.length; i++)
		if (words[i].length() > max) {
			max = words[i].length();
			maxIndex = i;
		}

	return words[maxIndex];
	}
}