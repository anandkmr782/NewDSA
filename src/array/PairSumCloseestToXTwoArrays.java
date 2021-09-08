package array;
import java.util.*;

public class PairSumCloseestToXTwoArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		closestPair(n1,arr1,n2,arr2,k);
		sc.close();

	}
	static void closestPair(int n1,int[] arr1,int n2,int[] arr2,int k)
	{
		int diff=Integer.MAX_VALUE;
		int res_l=0,res_r=0;
		int l=0,r=n2-1;
		while(l<n1 && r>=0)
		{
			if(Math.abs(arr1[l]+arr2[r]-k)<diff)
			{
				res_l=l;
				res_r=r;
				diff=Math.abs(arr1[l]+arr2[r]-k);
			}
			if(arr1[l]+arr2[r]>k)
			{
				r--;
			}else {
				l++;
			}
		}
		System.out.println("The closest pair is ["+arr1[res_l]+","+arr2[res_r]+"]");
	}
}
