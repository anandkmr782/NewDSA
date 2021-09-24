package array;

import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxWaterTrap(n,arr));
        sc.close();
    }
    static int maxWaterTrap(int n,int arr[])
    {
        int res=0;
        int left[]=new int[n];
        int cur=0;
        for(int i=0;i<n;i++)
        {
            left[i]=Math.max(cur,arr[i]);
            cur=left[i];
        }
        int right[]=new int[n];
        cur=0;
        for (int i=n-1;i>=0;i--)
        {
            right[i]=Math.max(cur,arr[i]);
            cur=right[i];
        }
        for(int i=0;i<n;i++)
        {
            res=res+(Math.min(left[i],right[i])-arr[i]);
        }
        return res;
    }
}
