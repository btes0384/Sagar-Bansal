package sourcePackage;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=0;
int reversenum=0;
System.out.println("Input Your Number and Press Enter");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	for(;num!=0;)
	{
		reversenum=reversenum*10;
		reversenum=reversenum+num%10;
		num=num/10;
	}
	System.out.println("Reverse Of Specified Number Is: "+reversenum);
	}
	

}
