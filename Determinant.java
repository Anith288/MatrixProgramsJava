import java.util.*;
class Determinant
{
	public static void main(String[] args)
	{
		int i,j,det=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter matrix");
		int a[][]=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
			
		}
		System.out.println("Det matrix is");
		det=(a[0][0]*a[1][1]) - (a[0][1]*a[1][0]);
		System.out.println(det);
	}
	
}