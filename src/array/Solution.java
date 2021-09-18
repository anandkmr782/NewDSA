package array;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		int minTem=sc.nextInt();
		int maxTem=sc.nextInt();
		int arr[]=new int[day];
		for(int i=0;i<day;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ls=new ArrayList<>();
		for(int i=0;i<day;i++)
		{
			if(arr[i]<minTem||arr[i]>maxTem)
			{
				ls.add(arr[i]);
			}
		}
		for(int e:ls)
		{
			System.out.print(e+" ");
		}
		sc.close();
	}

}
