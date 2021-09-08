package math;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
		sc.close();

	}
	static int fibonacci(int n)
	{
		int a=1,b=1,c=0,crt=3;
		if(n==1||n==2)
		{
			return 1;
		}
		for(crt=3;crt<=n;crt++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

}
