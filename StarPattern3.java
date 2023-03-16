import java.util.*;
public class StarPattern3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the integer N : ");
		int N = s.nextInt();

		for ( int i = 1; i <= N; i++)
		{	for( int j = 1; j <= N - i; j++)
			{
				System.out.print(" ");
			}
			for( int j = 1;j <= 2*i-1 ;j++)
			{
				if(i == N)
					System.out.print("*");
				else if( j==1 || j == (2*i - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			 System.out.println();
		} 
	}
}
