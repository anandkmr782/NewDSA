package dynamicProgramming;
import  java.io.*;
public class KnapSackProblem {
	public static void main(String[] args) throws IOException{
		BufferedReader bd=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(bd.readLine());
		int w[]=new int[m];
		for(int i=0;i<m;i++)
		{
			w[i]=Integer.parseInt(bd.readLine().trim());
		}
		int cost[]=new int[m];
		for(int i=0;i<m;i++)
		{
			cost[i]=Integer.parseInt(bd.readLine().trim());
		}
		int totalWeight=Integer.parseInt(bd.readLine());
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