package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int num = 0; //Introduced numbers
		int aux = 1; //Auxiliar
		Scanner sc = new Scanner(System.in); //Scanner declared
		System.out.println("Please introduce a positive number:");  //Program asks the user for a number
		System.out.println("*Remember! You can always introduce a negative number whenever you wanna end the program.*"); //Reminder
		num = sc.nextInt(); //First user input
		System.out.println(aux);
		while (num >= 0) { //Iteration loop
			num = sc.nextInt(); //Program grabs more user input.
			if (num >= 0) { //Program will only grab input when the number is positive.
				aux++; //Number of values increases by 1 at each loop.
				System.out.println(aux); //Number of values gets printed.
			}
		}
		System.out.println("Here is the number of values that you have introduced: " + aux); //Final output of number of values before terminating the program.
		sc.close(); //Scanner closes
	}
}