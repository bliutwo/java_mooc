
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Give a year: ");
		int year = Integer.valueOf(scan.nextLine());
		String not;
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				not = "";
			} else {
				not = "not ";
			}
		} else if (year % 4 == 0) {
			not = "";
		} else {
			not = "not ";
		}
		System.out.println("The year is " + not + "a leap year.");
		scan.close();
	}
}
