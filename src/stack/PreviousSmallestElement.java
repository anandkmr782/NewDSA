package stack;
import java.util.*;
public class PreviousSmallestElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        previousSmallestElement(n,arr);
        sc.close();
    }
    static void previousSmallestElement(int n,int arr[])
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && st.peek()>=arr[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                System.out.print("-1"+" ");
            }else{
                System.out.print(st.peek()+" ");
            }
            st.push(arr[i]);
        }
    }
}
