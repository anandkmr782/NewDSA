package array;

public class MoveAllNegativeToEnd {
    public static void main(String[] args){
        int arr[]={1,-1,3,2,-7,-5,11,6};
        int n=arr.length;
        negative(arr,n);
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
    }
    static void negative(int arr[],int n)
    {
        int j=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                res[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                res[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
}
