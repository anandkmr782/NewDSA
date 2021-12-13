package array;

import java.util.Scanner;

public class MinSumPath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(minSumPath(arr,m,n));
        sc.close();
    }
    static int minSumPath(int arr[][],int m,int n)
    {
        int sum=0;
        for(int i=1;i<m-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]<arr[i+1][j])
                {
                    sum=sum+arr[i][j];
                }else{
                    sum=sum+arr[i+1][j];
                }
            }
        }
        return sum;
    }
}
