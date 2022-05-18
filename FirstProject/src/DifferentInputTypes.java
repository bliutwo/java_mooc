import java.util.Scanner;

public class DifferentInputTypes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a string:");
		String words = scanner.nextLine();
		System.out.println("Give an integer:");
		int naturalNum = Integer.valueOf(scanner.nextLine());
		System.out.println("Give a double:");
		double realNum = Double.valueOf(scanner.nextLine());
		System.out.println("Give a boolean:");
		boolean binaryValue = Boolean.valueOf(scanner.nextLine());
		System.out.println("You gave the string " + words);
		System.out.println("You gave the integer " + naturalNum);
		System.out.println("You gave the double " + realNum);
		System.out.println("You gave the boolean " + binaryValue);
		scanner.close();
	}
}
