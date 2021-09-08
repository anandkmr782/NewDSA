package queue;

import java.util.PriorityQueue;

public class KthSmallest {

	public static void main(String[] args) {
		
		int a[]={5,5,4,6,4};
		int n=a.length;
		int k=2;
		System.out.println(smallest(a,n,k));

	}
	static int smallest(int a[],int n,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			pq.add(a[i]);
		}
		for(int i=0;i<k;i++)
		{
			if(pq.peek()<a[i])
			{
				pq.poll();
				pq.add(a[i]);
			}
		}
		return pq.peek();
		
	 }

}
