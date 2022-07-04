
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNums = 0;
		double total = 0;
		while (true) {
			int num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			}
			if (num > 0) {
				total += num;
				numNums++;
			}
		}
		if (numNums == 0) {
			System.out.println("Cannot calculate the average");
		} else {
			double average = total / numNums;
			System.out.println(average);
		}
		scanner.close();
	}
}
