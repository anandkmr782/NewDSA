package string;
import java.util.*;
public class MinNumOfBracketToBalance {

	public static void main(String[] args) {
		String str="}}{{";
		int n=str.length();
		System.out.println(minReversals(str,n));
		
	}
	static int minReversals(String s,int n)
	{
		if(n%2 !=0)
		{
			return -1;
		}
		Stack<Character> st=new Stack<>();
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if(c=='}'&& !st.empty())
			{
				if(st.peek()=='{')
				{
					st.pop();
				}else {
					st.push(c);
				}
			}else {
				st.push(c);
			}
		}
		int red_len=st.size();
		int n1=0;
		while(!st.empty() && st.peek()=='{')
		{
			st.pop();
			n1++;
		}
		return (red_len/2+n1%2);
	}

}
