package array;

public class Sol2 {
    public static void main(String[] args)
    {
        int arr[]={2,5,6,7,8,8,9,11,22,19,14,15,18};
        int d=5;
        int res[]=nearest(arr,d);
        for(int e:res)
        {
            System.out.print(e+" ");
        }
    }
    static int[] nearest(int[] arr,int d)
    {
        int res[]=new int[d];
        for(int i=0;i<d;i++)
        {
            res[i]=arr[i];
        }
        for(int i=d;i<arr.length-d;i++)
        {
            arr[i-d]=arr[i];
        }
        int j=0;
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i]=res[j];
            j++;
        }
        return arr;
    }
}
