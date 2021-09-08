package hash;

import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test case: ");
		int t=sc.nextInt();
		while(t-- >0)
		{
			System.out.println("Enter the string: ");
			String s=sc.next();
			int n=s.length();
			char ch[]=s.toCharArray();
			System.out.println(firstDuplicate(ch,n));
			
		}
		System.out.println("Your test case complete");
		sc.close();
	}

	static char firstDuplicate(char[] ch, int n)
	{
		HashSet<Character> hs=new HashSet<>();	
		for(int i=0;i<n-1;i++)
		{
			char c=ch[i];
			if(hs.contains(c))
			{
				return c;
			}else {
				hs.add(c);
			}
		}
		return '\0';

	}

}
