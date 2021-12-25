package array;

public class ReorderArrayACIndex {
    public static void main(String[] args)
    {
        int arr[]={50,40,70,60,90};
        int index[]={3,0,4,1,2};
        int n=arr.length;
        rearrange(arr,index,n);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
    }
    static void rearrange(int arr[],int index[],int n)
    {
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[index[i]]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
}
