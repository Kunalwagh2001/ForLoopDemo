package Algorithm;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num = 10;

		int firstnumber = 0;
		int secondnumber = 1;

		System.out.println("Fibonacci Series up to " + num + " numbers:");
		System.out.print(firstnumber + " " + secondnumber + " ");

		for (int i = 2; i <= num; i++) {
			int nextNumber = firstnumber + secondnumber;
			System.out.print(nextNumber + " ");

			firstnumber = secondnumber;
			secondnumber = nextNumber;
		}
	}

}
