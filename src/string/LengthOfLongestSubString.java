package string;

import java.util.*;

public class LengthOfLongestSubString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(lengthOfSubString(s));
		sc.close();
	}
	static int lengthOfSubString(String s)
	{
		HashMap<Character,Integer> hs=new HashMap<>();
		int maxLength=0;
		int start=0;
		for(int i=0;i<s.length();i++)
		{
			if(hs.containsKey(s.charAt(i)))
			{
				start=Math.max(start, hs.get(s.charAt(i))+1);
			}
			hs.put(s.charAt(i),i);
			maxLength=Math.max(maxLength,i-start+1);
		}
		for(Map.Entry<Character,Integer> e:hs.entrySet())
		{
			System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());
		}
		return maxLength;
	}
}
