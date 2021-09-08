package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]= {-3,2,100,5,-2,0,1,50};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			for(int j=i;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		for(int e:arr)
		{
			System.out.print(e+" ");
		}

	}

}
