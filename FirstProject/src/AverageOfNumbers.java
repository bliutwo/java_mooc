
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		int numNums = 0;
		while(true) {
			System.out.println("Give a number:");
			int num = Integer.valueOf(scanner.nextLine());
			if (num == 0) {
				break;
			}
			total += num;
			numNums++;
		}
		double average = total / numNums;
		System.out.println("Average of the numbers: " + average);
		scanner.close();
	}
}
