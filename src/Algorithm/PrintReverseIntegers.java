package Algorithm;

public class PrintReverseIntegers {
	public static void main(String[] args) {
		
	/*	int num = 1544;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);*/
		
		int num = 2721;
		StringBuilder sb = new StringBuilder(String.valueOf(num));
		StringBuilder rev = sb.reverse();
		
		System.out.println(rev);
		
	}

}
