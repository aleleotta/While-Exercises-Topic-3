package exercises;
import java.util.*;

public class Exercise8 {
	public static void main(String[] args) {
		int maxHeight = 0;
		int height = 0;
		int trees = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce a height: ");
		System.out.println("*Introduce a negative number to terminate.*");
		height = sc.nextInt();
		while (height > 0) {
			trees++;
			if (height > maxHeight) {
				maxHeight =+ height;
			}
			System.out.println("Number of trees: " + trees);
			System.out.println("Maximum height: " + maxHeight);
			height = sc.nextInt();
		}
		System.out.println("The highest tree is " + maxHeight + " cm high.");
		System.out.println("The number of trees in the area is: " + trees);
		System.out.println("Have a nice day!");
		sc.close();
	}
}
