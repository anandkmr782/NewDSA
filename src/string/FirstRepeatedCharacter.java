package string;
import java.util.*;
public class FirstRepeatedCharacter{
	public static void main(String[] args)
	{
		String s="geeks";
		char ch[]=s.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		int n=hs.size();
		for(int i=0;i<n;i++)
		{
			char c=ch[i];
			if(hs.contains(c))
			{
				System.out.println(c);
				break;
			}else{
				hs.add(c);
			}
		}
		

	}
}