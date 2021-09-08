package recusion;

import java.util.Scanner;

public class NthTerm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the Nth term: ");
		long n=sc.nextLong();
		System.out.println(fibonacci(n));
		sc.close();

	}
	static long fibonacci(long n)
	{
		long a=1,b=1,c=0,i=3;
		if(n==1||n==2)
		{
			return 1;
		}
		for(i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
		
	}

}
