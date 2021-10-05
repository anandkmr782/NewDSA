package stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestHistogramArea {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxHistogramArea(n,arr));
    }
    static int maxHistogramArea(int n,int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int topArea;
        int tp;
        int i=0;
        while(i<n)
        {
            if(st.empty()||arr[st.peek()]<=arr[i])
            {
                st.push(i++);
            }else{
                tp= st.peek();
                st.pop();
                topArea=arr[tp]*(st.empty()?i:i-st.peek()-1);
                if(maxArea<topArea)
                {
                    maxArea=topArea;
                }
            }
        }
        while(st.empty()==false)
        {
            tp=st.peek();
            st.pop();
            topArea=arr[tp]*(st.empty()?i:i-st.peek()-1);
            if(maxArea<topArea)
            {
                maxArea=topArea;
            }
        }
        return maxArea;

    }
}
