package dynamicProgramming;

import java.util.Scanner;

public class Lcs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(lcs(s1,s2));
		sc.close();
	}
	static int lcs(String s1,String s2)
	{
		char x[]=s1.toCharArray();
		char y[]=s2.toCharArray();
		int n1=x.length;
		int n2=y.length;		
		int matrix[][]=new int[n1+1][n2+1];
		for(int i=0;i<=n1;i++)
		{
			for(int j=0;j<=n2;j++)
			{
				if(i==0||j==0)
				{
					matrix[i][j]=0;
				}else if(x[i-1]==y[j-1])
				{
					matrix[i][j]=matrix[i-1][j-1]+1;
				}else {
					matrix[i][j]=max(matrix[i-1][j],matrix[i][j-1]);
				}
			}
		}
		return matrix[n1][n2];
	}
	static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}else {
			return b;
		}
	}
}
