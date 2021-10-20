package recursion;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(pascal(n,m));
		sc.close();

	}
	static int pascal(int n,int m)
	{
		if(n==0||m==0||n==m)
		{
			return 1;
		}else {
			return pascal(n-1,m)+pascal(n-1,m-1);
		}
	}

}
