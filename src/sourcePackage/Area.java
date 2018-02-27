package sourcePackage;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
System.out.println("Enter the side of the square ");
Scanner s=new Scanner(System.in);
i=s.nextInt();
System.out.println("Enter the circumference of the circle ");
j=s.nextInt();
Area(i);
Circum(j);
	}
public static void Area(int n)
{
	int o=n*n;
	System.out.println("The area of the square is"+o);
	
}
public static void Circum(int j)
{
	double k=2*Math.PI*j;
	System.out.println("Ther circumference of the circle is"+k);
}
}
