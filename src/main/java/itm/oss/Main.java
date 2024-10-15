package itm.oss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = scanner.nextInt();

		Calculator calculator = new Calculator();

		int add = calculator.add(num1, num2);

		int subtract = calculator.subtract(num1, num2);
	}
}