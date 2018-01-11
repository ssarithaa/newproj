package javaTut;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int numbers[] = { 100, 100, 100, 14, 14 };
		System.out.println("Enter number to search");
		int searchfor = new Scanner(System.in).nextInt();
		LargestNumber.Largest(numbers);
		LargestNumber.Find(searchfor, numbers);

	}

	private static void Largest(int[] numbers) {
		int largest = 0;
		int secondlargest = 0;
		int thirdlargest = 0;
		System.out.print("Array input is : {");
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				thirdlargest = secondlargest;
				secondlargest = largest;
				largest = numbers[i];

			} else {
				if ((secondlargest < numbers[i]) && (largest != numbers[i])) {
					thirdlargest = secondlargest;
					secondlargest = numbers[i];
				} else {
					thirdlargest = (((thirdlargest < numbers[i]) && (secondlargest != numbers[i])) ? numbers[i]
							: thirdlargest);
				}
			}

			System.out.print(numbers[i] + ",");
		}

		System.out.println("}\nLargest = " + largest);
		System.out.println("SecondLargest = " + secondlargest);
		System.out.println("ThirdLargest = " + thirdlargest);
	}

	private static void Find(int number, int[] arrayofnumbers) {
		int index = -1;
		for (int i = 0; i < arrayofnumbers.length; i++) {
			if (arrayofnumbers[i] == number) {
				index = i;
				break;
			}

		}
		System.out.println(
				(index < 0) ? "Number " + number + " not in array" : "Number " + number + " is at Index : " + index);
	}

}
