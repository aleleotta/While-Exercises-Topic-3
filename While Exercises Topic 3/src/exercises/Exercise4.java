package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will check whether a number is even or odd.");
		System.out.println("*You can always enter 0 whenever you wanna stop introducing numbers.*");
		System.out.println("Please insert a number: ");
		while (num != 0) {
			num = sc.nextInt();
			if (num % 2 == 0 && num != 0) {
				System.out.println("The introduced number is even.");
			} else if (num % 2 == 1 && num != 0) {
				System.out.println("The introduced number is odd.");
			}
		}
		System.out.println("Have a nice day!");
		sc.close();
	}
}