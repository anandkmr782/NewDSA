package dynamicProgramming;
import  java.io.*;
import java.util.*;
public class KnapSackProblem {
	public static void main(String[] args) throws IOException{
		Scanner bd=new Scanner(System.in);
		int m=bd.nextInt();
		int w[]=new int[m];
		for(int i=0;i<m;i++)
		{
			w[i]=bd.nextInt();
		}
		int cost[]=new int[m];
		for(int i=0;i<m;i++)
		{
			cost[i]=bd.nextInt();
		}
		int totalWeight=bd.nextInt();
		System.out.println(maxProfit(m,w,cost,totalWeight));
		bd.close();
	}
	static int maxProfit(int m,int[] w,int[] cost,int totalWeight)
	{
		int matrix[][]=new int[m+1][totalWeight+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=totalWeight;j++)
			{
				if(i==0||j==0)
				{
					matrix[i][j]=0;
				}
				else if(w[i-1]<=j)
				{
					matrix[i][j]=max(cost[i-1]+matrix[i-1][j-w[i-1]],matrix[i][j]);
				}else{
					matrix[i][j]=matrix[i-1][j];										
				}
			}
		}
		return matrix[m][totalWeight];
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
