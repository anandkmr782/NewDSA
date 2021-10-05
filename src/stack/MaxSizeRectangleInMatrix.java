package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class MaxSizeRectangleInMatrix {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int col=sc.nextInt();
        int row=sc.nextInt();
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxRectangle(arr));
        sc.close();
    }
    static int maxRectangle(int arr[][])
    {
        int temp[]=new int[arr[0].length];
        int max_area=0;
        int area;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<temp.length;j++)
            {
                if(arr[i][j]==0)
                {
                    temp[j]=0;
                }else{
                    temp[j]+=arr[i][j];
                }
            }
            area=maxHistogram(temp);
            if(max_area<area)
            {
                max_area=area;
            }
        }
        return max_area;
    }
    static int maxHistogram(int temp[])
    {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int tp;
        int topArea;
        int i=0;
        while(i<temp.length)
        {
            if(st.empty()||temp[st.peek()]<=temp[i])
            {
                st.push(i++);
            }else{
                tp=st.peek();
                st.pop();
                topArea=temp[tp]*(st.empty() ?i:i-st.peek()-1);
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
            topArea=temp[tp]*(st.empty() ?i:i-st.peek()-1);
            if(maxArea<topArea)
            {
                maxArea=topArea;
            }
        }
        return maxArea;
    }
}
