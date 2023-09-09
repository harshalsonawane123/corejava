package Polymorphism;
import java.util.Scanner;

public class Result {
	public static void main(Result[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		Result input = scanner.nextLine();

		char characterToRemove = 'a';

		Result result = removeFirstAndLastCharacter(input, characterToRemove);
		System.out.println("Result  " + characterToRemove + ": " + result);

		scanner.close();
	}

	public static Result removeFirstAndLastCharacter(Result str, char c) {
		int firstIndex = str.indexOf(c);
		int lastIndex = str.lastIndexOf(c);

// If both first and last occurrences are the same, return the original string
		if (firstIndex == lastIndex) {
			return str;
		}

// Remove the first and last occurrences of the character
		StringBuilder result = new StringBuilder();

// Append characters before the first occurrence
		result.append(str, 0, firstIndex);

// Append characters after the first occurrence, excluding the last occurrence
		result.append(str, firstIndex + 1, lastIndex);

// Append characters after the last occurrence
		result.append(str, lastIndex + 1, str.length());

		return result.toString();
	}
}