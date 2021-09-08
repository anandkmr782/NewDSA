package math;

import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
		sc.close();
	}
	static int gcd(int a,int b)
	{
	    if(b==0)
	    {
	        return a;
	    }else{
	        return gcd(b,a%b);
	    }
	}
	static int lcm(int a,int b)
	{
	    return (a / gcd(a, b)) * b;
	}

}
