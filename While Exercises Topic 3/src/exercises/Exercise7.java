package exercises;
import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		int secretN;
		int userN = 0;
		Scanner sc = new Scanner(System.in);
		secretN = (int) (Math.random() * 100); //Given functionality to the secret number, casting int type, (Math.random() + range)
		System.out.println(secretN);
		System.out.println("Try to guess the secret number. \nType in a random number from 0 to 100");
		while (secretN != userN && userN >= 0) {
			if (userN > secretN) {
				System.out.println("Your number is greater than the secret number.");
			}
			if (userN < secretN) {
				System.out.println("Your number is less than the secret number.");
			}
			userN = sc.nextInt();
		}
		if (userN >= 0) {	
			System.out.println("Congrats!!! You guessed the number!");
			
		} else {
			System.out.println("The secret number was: " + secretN + " You lost! Try again next time.");
		}
		System.out.println("Game Over");
		sc.close();
	}
}