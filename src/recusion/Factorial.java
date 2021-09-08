package recusion;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial: ");
		int n=sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}
	static int fact(int n)
	{
		int mul=1;
		for(int i=1;i<=n;i++)
		{
			mul=mul*i;
		}
		return mul;
	}

}
