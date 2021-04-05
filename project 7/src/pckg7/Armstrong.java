package pckg7;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner p=new Scanner (System.in);
		System.out.println("enter the number");
		int s=p.nextInt();
		int a=s;
		int sum=0;
		while (a!=0) {
			int d=a/10;
			int c=a%10;
			a=d;
			sum=sum+c*c*c;
			
}
		if (sum==s) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
			
			
		}
		
			
		
		
		
		
		
	}
}
