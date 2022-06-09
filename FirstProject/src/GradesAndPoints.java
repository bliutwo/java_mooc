
import java.util.Scanner;

public class GradesAndPoints {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give points [0-100]:");
		int points = Integer.valueOf(scan.nextLine());

		String output;

		if (points < 0) {
			output = "impossible!";
		} else if (points < 50) {
			output = "failed";
		} else if (points < 60) {
			output = "1";
		} else if (points < 70) {
			output = "2";
		} else if (points < 80) {
			output = "3";
		} else if (points < 90) {
			output = "4";
		} else if (points < 101) {
			output = "5";
		} else {
			output = "incredible!";
		}

		System.out.println(output);

		scan.close();
	}
}
