package stack;
import java.util.*;
public class BalanceBracket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(bracketsBalance(str))
		{
			System.out.println("Balance");
		}else {
			System.out.println("unbalance");
		}
		sc.close();
	}
	static boolean bracketsBalance(String str)
	{
		Deque<Character> stack=new ArrayDeque<>();
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x=='(' || x=='[' || x=='{')
			{
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			switch(x)
			{
			    case ')':
			    	check=stack.pop();
			    	if(check=='{' || check=='[')
			    	{
			    		return false;
			    	}
			    	break;
			    case '}':
			    	check=stack.pop();
			    	if(check=='(' || check=='[')
			    	{
			    		return false;
			    	}
			    	break;
			    case ']':
			    	check=stack.pop();
			    	if(check=='('|| check=='{')
			    	{
			    		return false;
			    	}
			    	break;
			    	
			}
		}
		return (stack.isEmpty());
	}
}
