import java.util.*; 
class Transpose
{
	public static void main(String[] args)
	{
		int m,n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		m=s.nextInt();
		System.out.println("Enter no of coulmns");
		n=s.nextInt();
		System.out.println("Enter matrix");
		int a[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("print matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println("  ");
		}
		System.out.println("Transpose of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[j][i]+ " ");
			}
			System.out.println(" ");
		}
	} 
}