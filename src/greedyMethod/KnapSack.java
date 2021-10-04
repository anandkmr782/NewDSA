package greedyMethod;

import java.util.Arrays;
import java.util.Scanner;

public class KnapSack{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int profit[]=new int[p];
        for(int i=0;i<p;i++)
        {
            profit[i]=sc.nextInt();
        }
        int weight[]=new int[p];
        for(int i=0;i<p;i++)
        {
            weight[i]=sc.nextInt();
        }
        int totalWeight=sc.nextInt();
        System.out.println(maxProfit(profit,weight,totalWeight));
        sc.close();
    }
    static int maxProfit(int profit[],int weight[],int totalWeight)
    {
        int max=0;
        int n=profit.length;
        double arr[]=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=profit[i]/weight[i];
        }


        return max;
    }
}
