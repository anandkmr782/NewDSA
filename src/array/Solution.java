package array;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String b=Integer.toBinaryString(n);
		System.out.println(b);
		int max=0;
		int count=0;
		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i)=='1')
			{
				count++;
			}else{
				count=0;
			}
			if(count>max)
			{
				max=count;
			}
		}
		System.out.println(max);
		sc.close();

	}
}