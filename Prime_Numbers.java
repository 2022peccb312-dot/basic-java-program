import java.util.*;
class Prime_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		if(count==1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}
}
