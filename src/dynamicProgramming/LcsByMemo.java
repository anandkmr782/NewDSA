package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LcsByMemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        int tables[][]=new int[m+1][n+1];
        for(int[] e:tables)
        {
            Arrays.fill(e,-1);
        }
        System.out.println(lcs(s1,s2,m,n,tables));
        sc.close();
    }
    static int lcs(String s1,String s2,int m,int n,int[][] tables)
    {
        if(tables[m][n]!=-1)
        {
            return tables[m][n];
        }
        if(m==0||n==0)
        {
            tables[m][n]=0;
        }else{
            if(s1.charAt(m-1)==s2.charAt(n-1))
            {
                tables[m][n]=1+lcs(s1,s2,m-1,n-1,tables);
            }else{
                tables[m][n]=Math.max(lcs(s1,s2,m-1,n,tables),lcs(s1,s2,m,n-1,tables));
            }
        }
        return tables[m][n];
    }
}
