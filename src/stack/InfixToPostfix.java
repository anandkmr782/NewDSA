package stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        infixToPost(s);
        sc.close();
    }
    static void infixToPost(String s)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }
            if(s.charAt(i)=='a')
            {
                System.out.print(s.charAt(i)+"");
            }
            if(s.charAt(i)==')')
            {

            }
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
            {
                if(st.empty())
                {

                }else{
                    
                }
            }
        }
    }
}
