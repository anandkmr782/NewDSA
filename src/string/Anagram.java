package string;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String a=sc.next();
		System.out.println("Enter the second String: ");
		String b=sc.next();
		System.out.println(anagram(a,b));
		sc.close();
	}
	static String anagram(String a,String b)
	{
		int arr1[]=new int[256];
		int arr2[]=new int[256];
		for(char c:a.toCharArray())
		{
			int index=(int)c;
			arr1[index]++;
		}
		for(char c:b.toCharArray())
		{
			int index=(int)c;
			arr2[index]++;
		}
		String s="Anagram";
		for(int i=0;i<256;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				s="Not Anagram";
				break;
			}
		}
		return s;
	}

}
