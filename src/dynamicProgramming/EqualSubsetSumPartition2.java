package dynamicProgramming;

import java.util.Scanner;

public class EqualSubsetSumPartition2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println(equalSum(n,arr));
			sc.close();
		}
		static boolean equalSum(int n,int[] arr)
		{
			int sum=0;
			for(int i=0;i<n;i++)
			{
				sum=sum+arr[i];
			}
			if(sum%2!=0)
			{
				return false;
			}
			boolean matrix[][]=new boolean[sum/2+1][n+1];
			for(int i=0;i<=n;i++)
			{
				matrix[0][i]=true;
			}
			for(int i=1;i<=sum/2;i++)
			{
				matrix[i][0]=false;
			}
			for(int i=1;i<=sum/2;i++)
			{
				for(int j=1;j<=n;j++)
				{
					matrix[i][j]=matrix[i][j-1];
					if(i>=arr[j-1])
					{
						matrix[i][j]=matrix[i][j]||matrix[i-arr[j-1]][j-1];
					}
				}
			}
			return matrix[sum/2][n];
		}
}
