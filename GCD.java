import java.util.*;
class GCD 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt(); 
		int start=0;
		if (num1>num2)
		{
			start=num1;
		}
		else
		{
			start=num2;
		}
		for(int i=start;i>0;i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println("GCD:" + i);
				break;
			}
		}
			
		
	}
}
