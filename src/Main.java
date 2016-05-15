import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter sides of a triangle");

		System.out.println("Please enter integer a:");
		int a = input.nextInt();

		System.out.println("Please enter integer b:");
		int b = input.nextInt();

		System.out.println("Please enter integer c:");
		int c = input.nextInt();

		if (a < (b + c) && b < (a + c) && c < (a + b)) {
			System.out.println("The sides of the triangle are: " + "a:" + a + " b:" + b + " c:" + c);

		} else {
			System.out.println("Try again!");
		}

		input.close();

	}
}
