package patterns;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	int a=2;
	for(int i=1;i<=5;i++)
	{
		for(int j=2;j<=i;j++)
		{
			System.out.print(a+" ");
			a=a+1;
		}
		System.out.println();
	}
	}

}
