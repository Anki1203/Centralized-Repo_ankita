package pckg7;

import java.util.Scanner;

public class Fibnocci {
	public static void main(String [] args) {
		int a=0;
		int b=1;
		System.out.println("Enter the number");
		Scanner p=new Scanner (System.in);
		int s=p.nextInt();
		for (int i=1; i<=15;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(a  +  ",");
			
			
			
			
			
		
			
		}
		
		
	}


}
