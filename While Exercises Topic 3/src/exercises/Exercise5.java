package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int numberInput;
		int positiveNumbers = 0;
		int zeroNumbers = 1;
		int negativeNumbers = 0;
		int negativeAverage = 0;
		int increment = 0;
		int numberValues = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a number: ");
		numberInput = sc.nextInt();
		while (numberValues > 1) {
			numberValues--;
			System.out.println("Remaining values: " + numberValues);
			if (numberInput > 0) { //Positive block
				positiveNumbers = positiveNumbers + numberInput;
				System.out.println("Sum of positive numbers: " + positiveNumbers);
			} else if (numberInput < 0) { //Negative block
				negativeNumbers = numberInput + negativeNumbers;
				increment++;
				negativeAverage = negativeNumbers / increment;
				System.out.println("Negative numbers average: " + negativeAverage);
			} else {
				zeroNumbers++;
				System.out.println("Amount of zeros: " + zeroNumbers);
			}
			numberInput = sc.nextInt();
		}
		System.out.println("Here is a summary of all values you have introduced: " + positiveNumbers + ", " + negativeAverage + ", " + zeroNumbers + ".");
		System.out.println("Have a nice day!");
		sc.close();
	}
}