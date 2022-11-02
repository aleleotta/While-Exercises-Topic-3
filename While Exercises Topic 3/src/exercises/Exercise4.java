package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int num = 1; //Declared variable
		Scanner sc = new Scanner(System.in); //Declared scanner
		System.out.println("This program will check whether a number is even or odd.");
		System.out.println("*You can always enter 0 whenever you wanna stop introducing numbers.*");
		System.out.println("Please insert a number: "); //Program asks for input.
		while (num != 0) { //While the variable is not equal to 0, the loop will execute.
			num = sc.nextInt();
			if (num % 2 == 0 && num != 0) { //Even block
				System.out.println("The introduced number is even.");
			} else if (num % 2 == 1 && num != 0) { //Odd block
				System.out.println("The introduced number is odd.");
			}
		}
		System.out.println("Have a nice day!"); //Once the loop gets terminated, this message will pop up and then program gets terminated.
		sc.close(); //Closing scanner
	}
}