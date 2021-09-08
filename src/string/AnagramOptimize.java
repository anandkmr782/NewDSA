package string;

import java.util.Scanner;
/*
 It take o(n) time
 space o(n)
 */
public class AnagramOptimize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String a=sc.next();
		System.out.println("Enter the second String: ");
		String b=sc.next();
		int arr[]=new int[256];
		for(char c:a.toCharArray())
		{
			int index=(int)c;
			arr[index]++;
		}
		for(char c:b.toCharArray())
		{
			int index=(int)c;
			arr[index]--;
		}
		String s="Anagram";
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
			{
				s="Not Anagram";
				break;
			}
		}
		System.out.println(s);
		sc.close();

	}

}
