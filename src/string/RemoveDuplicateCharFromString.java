package string;

import java.util.*;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		int n=s.length();
		System.out.println(removeDuplicate(s,n));
		System.out.println(removeDuplicate(s));		
		sc.close();

	}
	static String removeDuplicate(String s,int n)
	{
		char ch[]=s.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		for(char e:ch)
		{
			hs.add(e);
		}
		char st[]=new char[hs.size()];
		int i=0;
		for(char e:hs)
		{
			st[i++]=e;
		}
		String str=String.valueOf(st);
		return str;
	}
	static String removeDuplicate(String s)
	{
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
		    lhs.add(s.charAt(i));
		}
		char ch1[]=new char[lhs.size()];
		int i=0;
		for(Character ch:lhs)
		{
		    ch1[i++]=ch;
		}
		String s1=String.valueOf(ch1);
		return s1;
	}

}
