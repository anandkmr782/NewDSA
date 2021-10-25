package array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(triplet(arr,n))
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    static boolean triplet(int a[],int n)
    {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--)
        {
            int l=0;
            int r=i-1;
            while(l<r)
            {
                if(arr[l]+arr[r]==arr[i])
                {
                    return true;
                }
                if(arr[l]+arr[r]<arr[i])
                {
                    l++;
                }else {
                    r--;
                }
            }
        }
        return false;
    }
}
