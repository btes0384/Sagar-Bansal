package sourcePackage;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,n,b,temp=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number");
n=s.nextInt();
b=n;
while(n>0)
{
	a=n%10;
	n=n/10;
	temp=temp*10+a;
}
if(temp==b)
{
	System.out.println("Palindrome");
	}
else
{
	System.out.println("Not Palindrome");
}
	}

}
