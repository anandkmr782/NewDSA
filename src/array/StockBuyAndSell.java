package array;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProfit(n,arr));
        sc.close();
    }
    static int maxProfit(int n,int arr[])
    {
        int max=0;
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            int profit=arr[i]-min;
            max=Math.max(max,profit);
        }
        return max;
    }
}
