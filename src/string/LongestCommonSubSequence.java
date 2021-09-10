package string;

import java.util.Scanner;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(lcs(s1,s2));
		sc.close();
	}
	static int lcs(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m=ch1.length;
		int n=ch2.length;
		int matrix[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
				{
					matrix[i][j]=0;
				}else if(ch1[i-1]==ch2[j-1])
				{
					matrix[i][j]=matrix[i-1][j-1]+1;
				}else {
					matrix[i][j]=max(matrix[i-1][j],matrix[i][j-1]);
				}
			}
		}
		return matrix[m][n];
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
