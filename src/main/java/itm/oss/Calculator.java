package itm.oss;

public class Calculator {
	public int add (int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		if (num1 >= num2) {
			return num1 - num2;
		}else {
			return num2 - num1;
		}
	}

    public boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}