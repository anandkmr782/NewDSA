package array;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        majorityElement(n,arr);
        sc.close();
    }
    static void majorityElement(int n,int arr[])
    {
        int ele=element(n,arr);
        if(isMajority(n,arr,ele))
        {
            System.out.println(ele);
        }else{
            System.out.println("No majority element Present");
        }
    }
    static boolean isMajority(int n,int arr[],int ele)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return true;
        }else{
            return false;
        }
    }
    static int element(int n,int arr[])
    {
        int max=0;
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[max]==arr[i])
            {
                count++;
            }else{
                count--;
            }
            if(count==0)
            {
                max=i;
                count=1;
            }
        }
        return  arr[max];
    }
}
