package string;

import java.util.*;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(lps(s));
		sc.close();
	}
	static int lps(String s)
	{
		int n=s.length();
		int i,j,cl;
		int l[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			l[i][i]=1;
		}	
			for(cl=2;cl<=n;cl++)
			{
				for(i=0;i<n-cl+1;i++)
				{
					j=i+cl-1;
					if(s.charAt(i)==s.charAt(j) && cl==2)
					{
						l[i][j]=2;
					}else if(s.charAt(i)==s.charAt(j))
					{
						l[i][j]=l[i+1][j-1]+2;
					}else {
						l[i][j]=max(l[i][j-1],l[i+1][j]);
					}
					
				}
			}
		return l[0][n-1];
	}
	static int max(int x,int y)
	{
		if(x>y)
		{
			return x;
		}else {
			return y;
		}
	}
}
