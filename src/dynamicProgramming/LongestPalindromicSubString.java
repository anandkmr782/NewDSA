package dynamicProgramming;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lpss(s));
        sc.close();
    }
    static int lpss(String s)
    {
        int n=s.length();
        int len=0;
        boolean matrix[][]=new boolean[n][n];
        for(int g=0;g<n;g++)
        {
            for(int i=0,j=g;j<n;i++,j++)
            {
                if(g==0)
                {
                    matrix[i][j]=true;
                }else if(g==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        matrix[i][j]=true;
                    }else{
                        matrix[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && matrix[i+1][j-1]==true)
                    {
                        matrix[i][j]=true;
                    }else{
                        matrix[i][j]=false;
                    }
                }
                if(matrix[i][j])
                {
                    len=g+1;
                }
            }
        }
        return len;
    }
}
