package array;
import java.util.*;
public class ArraySpecialProduct{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the element of first array: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element of second array: ");
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int mul=1;
			for(int j=0;j<n;j++)
			{
				if(j!=i)
				{
					mul=mul*a[j];
				}
			}
			b[i]=mul;
		}
		System.out.println("****************");
		for(int e:b)
		{
			System.out.print(e+" ");
		}
		sc.close();
	}
}