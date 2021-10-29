package array;

import java.util.Arrays;

public class IsPrime {

	public static void main(String[] args) {
		boolean isPrime[]=sieveOfEratoSthenes(20);
		  for(int i=1;i<=20;i++)
		  {
		    System.out.println(i+" "+isPrime[i]);
		  }

	}

	private static boolean[] sieveOfEratoSthenes(int n) {
		
		boolean isPrime[]=new boolean[n+1];
		   for(int i=0;i<=n;i++)
		   {
			   isPrime[i]=true;
		   }
		   for(int i=2;i*i<=n;i++)
		   {
			   if(isPrime[i]==true)
			   {
				   for(int j=i*i;j<=n;j=j+i)
				   {
					   isPrime[j]=false;
				   }
			   }
		   }
		return isPrime;
	}

}
