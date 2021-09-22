package dynamicProgramming;

import java.util.Scanner;

public class MinCostFromStation1ToStation2 {
	static int N=4;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int matrix[][]=new int[m][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println(minCostCal(matrix));
		sc.close();

	}
	static int minCostCal(int[][] arr)
	{
		return calulateMinCost(arr,0,N-1);
	}
	static int calulateMinCost(int[][] cost,int s,int d)
	{
		int minCost=cost[s][d];
		if(s==d||s==d-1)
		{
			return cost[s][d];
		}
		for(int i=s+1;i<d;i++)
		{
			int temp=calulateMinCost(cost,s,i)+calulateMinCost(cost,i,d);
			if(temp<minCost)
			{
				minCost=temp;
			}
		}
		return minCost;
	}
}
