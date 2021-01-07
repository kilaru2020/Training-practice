package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Printing Prime numbers from 1 to 50*

		for (int i = 2; i < 50; i++) {

			if (i == 2 || i == 3) {
				System.out.println(i);
			}

			if (i % 2 > 0 && i % 3 > 0) {

				System.out.println(i);
			}

		}

	}

}
