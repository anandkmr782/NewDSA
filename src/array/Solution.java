package array;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Target number: ");
        int t=sc.nextInt();
        System.out.print(targetSum(arr,t));

    }
    static int targetSum(int arr[],int t)
    {
        int res=-1;
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        while(i<j)
        {
            int sum=arr[i]+arr[j];
            if(sum==t)
            {
                res=1;
                break;
            }
            if(sum<t)
            {
                i++;
            }
            if(sum>t)
            {
                j--;
            }

        }
        System.out.println(i+" "+j);
        return res;
    }
}
