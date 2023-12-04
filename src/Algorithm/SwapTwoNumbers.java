package Algorithm;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swaping : "+ a+" "+ b);
		
		int t = a; a= b; b = t;
		
		System.out.println("After Swaping : "+ a+" "+ b);
	}

}
