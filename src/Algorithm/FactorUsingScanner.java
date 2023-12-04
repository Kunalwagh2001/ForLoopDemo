package Algorithm;

import java.util.Scanner;

public class FactorUsingScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		
		for(int i=1; i<=50 ; i++) {
			if(num%i==0)
				System.out.println(i);
		}
	}

}
