
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Password?");

		String password = "Caput Draconis";

		String userInput = scan.nextLine();

		if (password.equals(userInput)) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Off with you!");
		}

		scan.close();
	}
}
