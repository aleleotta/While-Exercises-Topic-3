package exercises;
import java.util.*;

public class Exercise3_1 {
	public static void main(String[] args) {
		int sum = 0; //Sum of all numbers
		int num; //Introduced numbers
		int average = 0;
		int increment = 0;
		Scanner sc = new Scanner(System.in); //Scanner declared.
			System.out.println("Please introduce a positive number:");  //Program starts asking number to the user
			num = sc.nextInt(); //User input
			sum = num; //First number goes into sum
			while (num >= 0) { //Iteration loop
				System.out.println("Please introduce a positive number:"); //Same as before while block.
				num = sc.nextInt();
				if (num >= 0) {
					sum = sum + num; //This time the current sum will be added to the new sum with the new number.
					System.out.println("Sum: " + sum); //New sum gets printed.
					increment++;
					average = sum / increment; //Same as before while block.
				}
			}
		System.out.println("Here is the average from the sum (" + sum + ") of all numbers you have introduced: " + average); //Final output of sum before terminating the program.
		sc.close(); //Scanner closes
	}
}