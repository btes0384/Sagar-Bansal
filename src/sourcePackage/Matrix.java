package sourcePackage;
import java.util.Scanner;
public class Matrix 
{
 int a[][];
 int row,column;
 int i,j;
 void create()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of Rows");
	row=s.nextInt();
	System.out.println("Enter the number of Columns");
	column=s.nextInt();
	a=new int[row][column];
	for(int i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			a[i][j]=s.nextInt();
		}
		System.out.println();
	}
}
void display()
{
	System.out.println("\n The Matrix is:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			System.out.println("\t" + a[i][j]);
		}
		System.out.println();
		}
}
}
class creatematrix
{
	public static void main(String args[])
	{
	Matrix obj=new Matrix();
	obj.create();
	obj.display();
}
}

