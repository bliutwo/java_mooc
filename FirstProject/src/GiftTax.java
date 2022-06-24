
import java.util.Scanner;

public class GiftTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Value of the gift?");
		double value = Double.valueOf(scan.nextLine());
		double tax;
		double minimum;
		double rate;
		double lowerBound;
		if (value < 5000) {
			rate = 1.0;
			minimum = 0.0;
			lowerBound = 0.0;
		} else if (value >= 5000 && value < 25000) {
			minimum = 100.0;
			rate = 0.08;
			lowerBound = 5000.0;
		} else if (value >= 25000 && value < 55000) {
			minimum = 1700.0;
			rate = 0.1;
			lowerBound = 25000.0;
		} else if (value >= 55000 && value < 200000) {
			minimum = 4700.0;
			rate = 0.12;
			lowerBound = 55000.0;
		} else if (value >= 200000 && value < 1000000) {
			minimum = 22100.0;
			rate = 0.15;
			lowerBound = 200000.0;
		} else {
			minimum = 142100.0;
			rate = 0.17;
			lowerBound = 1000000.0;
		}
		tax = minimum + (value - lowerBound) * rate;
		if (tax == value) {
			System.out.println("No tax!");
		} else {
			System.out.println("Tax: " + tax);
		}
		scan.close();
	}
}
