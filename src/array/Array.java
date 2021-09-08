package array;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		ArrayList<Integer> as=new ArrayList<>();
		as.add(20);
		as.add(30);
		as.add(10);
		as.add(40);
		as.add(50);
		int n=as.size();
		reverseOrder(n,as);
		
	}
	static void reverseOrder(int n,ArrayList<Integer> as)
	{
		int s=n/2;
		int i=s,j=n-1;
		while(i<j)
		{
			int temp=as.get(i);
			as.set(i, as.get(j));
			as.set(j,temp);
			i++;
			j--;
		}
		for(int e:as)
		{
			System.out.println(e+" ");
		}
	}

}
