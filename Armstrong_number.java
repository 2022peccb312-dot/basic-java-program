import java.util.*;
class Armstrong_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int count=0;
		int num2=num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		int res=0;
		while(num1!=0)
		{
			int rem=num1%10;
			int mul=1;
			for (int i=1;i<=count;i++ )
			{
				 mul=mul*rem;
			}
			res=mul+res;
			num1/=10;
		}
		if(num2==res)
		System.out.println("Armstrong number");
		else
				System.out.println("not Armstrong number");
			
		
	}
}
