package string;

import java.util.*;

public class Lcs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(maxLcs(s1,s2));
		sc.close();

	}
	static int maxLcs(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int m=ch1.length;
		int n=ch2.length;
		int l[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 ||j==0)
				{
					l[i][j]=0;
				}else if(ch1[i-1]==ch2[j-1])
				{
					l[i][j]=l[i-1][j-1]+1;
				}else {
					l[i][j]=max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		return l[m][n];
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
