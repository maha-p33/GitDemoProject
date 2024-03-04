package collections;
import java.util.*;
public class MergeArrays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("emter the size");
		int size= sc.nextInt();
		int a1[]= new int[size];
		int a2[] =new int[size];
		System.out.println("enter data into first arr");
		for(int i =0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter data into secound arr");
		for(int i =0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		int res[]= new int[a1.length + a2.length];
		int j=0;
		for(int i=0;i<a1.length;i++,j++)
		{
			res[j]=a1[i];
		}
		for(int i=0;i<a2.length;i++,j++)
		{
			res[j]=a2[i];
		}
		System.out.println("merged array");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
			
		
		
	}
	
	
	}

