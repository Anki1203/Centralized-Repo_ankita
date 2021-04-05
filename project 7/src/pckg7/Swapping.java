package pckg7;

import java.util.Scanner;


public class Swapping {
	public static void main(String[] args) {
		System.out.println("Enter value of first and second number");
		Scanner p = new Scanner(System.in);
		int a1 = p.nextInt();
		int a2 = p.nextInt();
		
		System.out.println("Before swapping");
		System.out.println("Value of first number" + a1);
		System.out.println("Value of second number" + a2);
		a1=a1 * a2;
		a2=a1 / a2;
		a1= a1 / a2;
		
		System.out.println("after swapping");
		System.out.println("value of first number" + a1);
		System.out.println("value of second number" + a2);
		
		
		
		
		
	}

}
