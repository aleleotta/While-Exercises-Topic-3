package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int sum = 0; //Sum of all numbers
		int num, num1, num2 = 0; //Introduced numbers
		int average = 0; //Auxiliar
		int increment = 3; //When the first three numbers are introduced this value stays at 3, but when a loop happens, it adds 3 to the value. Ex: 1 loop = 6, 2 loops = 9, 3 loops = 12, etc...
		int confirmation = 1; //Equivalent to boolean confirmation.
		Scanner sc = new Scanner(System.in); //Scanner declared
		System.out.println("Please introduce the first positive number:");  //Program starts asking number to the user
		System.out.println("*Remember! You can always introduce a negative number whenever you wanna end the program.*"); //Reminder
		num = sc.nextInt();
		System.out.println("Please introduce the second positive number:");
		num1 = sc.nextInt();
		System.out.println("Please introduce the third positive number:");
		num2 = sc.nextInt();
		sum = num + num1 + num2; //Sum of all introduced numbers
		System.out.println(sum); //Sum is printed.
		average = sum / increment; //Average of all numbers is calculated.
		while (confirmation == 1 && num >= 0 && num1 >= 0 && num2 >= 0) { //Iteration loop
			System.out.println("Do you have any other numbers to insert? Y=1 or N=0"); //The user has the choice whether he/she wants to keep adding up numbers.
			confirmation = sc.nextInt();
			if (confirmation == 1) { //If a true value (1) is entered then the if block will execute.
				increment = increment + 3; //Increment changes by +3.
				System.out.println("Please introduce the first positive number:"); //Same as before while block.
				num = sc.nextInt();
				System.out.println("Please introduce the second positive number:");
				num1 = sc.nextInt();
				System.out.println("Please introduce the third positive number:");
				num2 = sc.nextInt();
				sum = sum + (num + num1 + num2); //This time the sum will add up to the last three introduced numbers.
				System.out.println(sum); //New sum gets printed.
				average = sum / increment; //Same as before while block.
			}
		}
		System.out.println("Here is the average from the sum (" + sum + ") of all numbers you have introduced: " + average); //Final output of sum before terminating the program.
		sc.close(); //Scanner closes
	}
}