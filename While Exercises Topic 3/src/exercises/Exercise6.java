package exercises;
import java.util.*;

public class Exercise6 {
	public static void main(String[] args) {
		int age;
		int ageSum = 0;
		int ageAverage = 0;
		int increment = 0;
		int nStudents = 0;
		int adult = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert an age: ");
		System.out.println("*You can always type a negative number to terminate the loop.*");
		age = sc.nextInt();
		while (age >= 0) {
			ageSum = ageSum + age;
			increment++;
			ageAverage = ageSum / increment;
			if (age >= 18) {
				adult++;
				System.out.println("Adult students: " + adult);
			}
			nStudents++;
			System.out.println("Students: " + nStudents + ", Age sum: " + ageSum + ", Age average: " + ageAverage + ", Adult students: " + adult + ".");
			age = sc.nextInt();
		}
		System.out.println("Summary:");
		System.out.println("Students: " + nStudents + ", Age sum: " + ageSum + ", Age average: " + ageAverage + ", Adult students: " + adult + ".");
		System.out.println("Have a nice day!");
		sc.close();
	}
}
