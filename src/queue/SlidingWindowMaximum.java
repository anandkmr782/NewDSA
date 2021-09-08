package queue;
import java.util.*;
public class SlidingWindowMaximum{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element of Array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Windows size: ");
		int k=sc.nextInt();
		int ans[]=maxSlidingWindow(arr,k);
		for(int e:ans)
		{
			System.out.print(e+" ");
		}
		sc.close();
	}
	static int[] maxSlidingWindow(int[] a,int k)
	{
		int n=a.length;
		if(n<=1)
		{
			return a;
		}
		Deque<Integer> dq=new LinkedList<>();
		int ans[]=new int[n-k+1];
		int i=0;
		for(;i<k;i++)
		{
			while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		for(;i<n;i++)
		{
			ans[i-k]=a[dq.peekFirst()];
			while(!dq.isEmpty() && dq.peekFirst()<=i-k)
			{
				dq.removeFirst();
			}
			while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
			{
				dq.removeLast();
			}
			dq.addLast(i);
		}
		ans[i-k]=a[dq.peekFirst()];
		return ans;
	}
}