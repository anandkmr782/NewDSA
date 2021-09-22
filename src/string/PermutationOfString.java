package string;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		permutationOfString(s,"");
		sc.close();

	}
	static void permutationOfString(String s,String res)
	{
		if(s.length()==0)
		{
			System.out.print(res+" ");
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String ros=s.substring(0, i)+s.substring(i+1);
			permutationOfString(ros,res+ch);
		}
	}

}
