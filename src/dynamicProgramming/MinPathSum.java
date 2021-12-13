package dynamicProgramming;

import java.util.Scanner;

public class MinPathSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int grid[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(minSumPath(grid));
    }
    static int minSumPath(int[][] grid)
    {
        if(grid==null||grid.length==0)
        {
            return 0;
        }
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                dp[i][j]=dp[i][j]+grid[i][j];
                if(i>0&&j>0)
                {
                    dp[i][j]=dp[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
                }else if(i>0)
                {
                    dp[i][j]=dp[i][j]+dp[i-1][j];
                }else if(j>0)
                {
                    dp[i][j]=dp[i][j]+dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
