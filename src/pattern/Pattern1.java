package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int n=4;
		int number=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(number);
				number++;
			}
			System.out.println();
		}

	}

}
