import java.util.Scanner;

public class Story {
	public static void main(String[] args) {
		System.out.println("I will tell you a story, but I need some information first.");
		System.out.println("What is the main character called?");
		Scanner scanner = new Scanner(System.in);
		String mainChar = scanner.nextLine();
		System.out.println("What is their job?");
		String charJob = scanner.nextLine();
		System.out.println("Here is the story:");
		System.out.println("Once upon a time there was " + mainChar + ", who was " + charJob + ".");
		System.out.println("On the way to work, " + mainChar + " reflected on life.");
		System.out.println("Perhaps " + mainChar + " will not be " + charJob + " forever.");
		scanner.close();
	}
}