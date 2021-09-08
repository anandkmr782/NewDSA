package string;
import java.util.*;
public class DuplicateWord {

	public static void main(String[] args) {
		
		String str="Hi, I am Anand kumar and I am a programmer and Anand";
		String[] word=str.split("\\W");
		HashMap<String,Integer> word_map=new HashMap<>();
		for(String e:word)
		{
			if(word_map.get(e)!=null)
			{
				word_map.put(e,word_map.get(e)+1);
				
			}else {
				word_map.put(e, 1);
			}
		}
		Set<String> word_set=word_map.keySet();
		int count=0;
		for(String e:word_set)
		{
			if(word_map.get(e)>1)
			{
				System.out.println(e);
				count++;
			}
		}
		System.out.println(count);
	}

}
