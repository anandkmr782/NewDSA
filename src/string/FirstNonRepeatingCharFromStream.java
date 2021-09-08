package string;
import java.util.*;
public class FirstNonRepeatingCharFromStream {
	final static int MAX_CHAR=256;

	public static void main(String[] args) {
		firstNonRepeatingChar();
	}
	static void firstNonRepeatingChar()
	{
		List<Character> ls=new ArrayList<>();
		boolean[] repeated=new boolean[MAX_CHAR];
		String stream="geeksforgeeksandgeeksquizfor";
		for(int i=0;i<stream.length();i++)
		{
			char x=stream.charAt(i);
			System.out.println("Reading "+x+" from stream \n");;
			if(!repeated[x])
			{
				if(!(ls.contains(x)))
				{
					ls.add(x);
				}else {
					ls.remove((Character)x);
					repeated[x]=true;
				}
			}
			if(ls.size()!=0)
			{
				System.out.println("First non-repeating character so far is ");;
				System.out.println(ls.get(0));
			}
		}
	}

}
