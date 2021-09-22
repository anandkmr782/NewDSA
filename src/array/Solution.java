package array;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(possible(s1,s2));
		sc.close();

	}
	static String possible(String s1,String s2)
	{
		String res="Yes";
		if(s1.length()==s2.length())
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<s1.length();i++)
			{
				if(ch1[i]!=ch2[i])
				{
					res="No";
					break;
				}
			}
		}else {
			res="No";
		}
		return res;
	}

}
