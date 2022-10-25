package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int sum = 0; //Sum of all numbers
		int num = 0; //Introduced numbers
		Scanner sc = new Scanner(System.in); //Scanner declared
		System.out.println("Please introduce a positive number:");  //Program asks the user for a number
		System.out.println("*Remember! You can always introduce a negative number whenever you wanna end the program.*"); //Reminder
		while (num >= 0) { //Iteration loop
			sum = sum + num; //Sum is 0 at the beginning then constantly keeps adding up with num until a negative num is introduced.
			System.out.println(sum); //Sum gets printed.
			num = sc.nextInt(); //Program grabs input.
		}
		System.out.println("Here is the sum of all numbers you have introduced: " + sum); //Final output of sum before terminating the program.
		sc.close(); //Scanner closes
	}
}
