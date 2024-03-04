package collections;
import java.util.Scanner;
public class Exceptionss {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number ");
		int a = sc.nextInt();
		System.out.println("enter the dividor ");
		int div = sc.nextInt();
		try {
			System.out.println(a/div);
		}
		catch(Exception e)
		{
			System.out.println("cannotg divide the number by 0");
		}
		
		
		
		
	}
	
	

}
