import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a number:");
		int num = Integer.valueOf(scan.nextLine());
		String parity;
		if (num % 2 == 0) {
			parity = "even";
		} else {
			parity = "odd";
		}
		System.out.println("Number " + num + " is " + parity);
		scan.close();
	}
}
