import java.util.*;
class Matrix
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("enter no of rows");
		m=s.nextInt();
		System.out.println("enter no of columns");
		n=s.nextInt();
		System.out.println("enter 1st matrix");
		int a[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();

			}
		}
		System.out.println("enter 2nd matrix");
		int b[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		int result[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The sum of matrices is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(result[i][j] + "   ");
			}
			System.out.println(" ");
		}
			
		
	}
}