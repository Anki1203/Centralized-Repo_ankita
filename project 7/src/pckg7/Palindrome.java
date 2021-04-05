package pckg7;

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the number");
		int p=s.nextInt();
		int a=p;
		int sum=0;
		while (a!=0) {
			int b=a/10;
			int d=a%10;
			a=b;
			sum=sum*10+d;
			
		}
		if (p==sum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
			
		}
	}

}
