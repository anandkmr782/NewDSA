package recusion;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find gcd: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a,b));
		sc.close();
		

	}
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}else {
			return gcd(b,a%b);
		}
	}

}
