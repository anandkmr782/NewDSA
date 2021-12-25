package array;

import java.util.*;

public class Sol2 {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println(equiberiumPoint(str));
    }
    static int equiberiumPoint(String str)
    {
        String p1=str.substring(0,str.length()/2);
        String p2=str.substring(str.length()/2);
        char ch1[]=p1.toCharArray();
        char ch2[]=p2.toCharArray();
        int l=0,r=p1.length()-1;
        while(l<r)
        {
            if(ch1[l]>ch1[r])
            {
                char temp=ch1[l];
                ch1[l]=ch1[r];
                ch1[r]=temp;
                l++;
                r--;
            }else {
                l++;
                r--;
            }
        }
        int l1=0,r1=p2.length()-1;
        while(l1<r1)
        {
            if(ch2[l1]>ch2[r1])
            {
                char temp=ch2[l1];
                ch2[l1]=ch2[r1];
                ch2[r1]=temp;
                l1++;
                r1--;
            }else {
                l1++;
                r1--;
            }
        }
        String res=String.valueOf(ch1);
        String res1=String.valueOf(ch2);
        System.out.println(res+"  "+res1);
        int sum=Integer.parseInt(res)+Integer.parseInt(res1);
        return sum;
    }

}
