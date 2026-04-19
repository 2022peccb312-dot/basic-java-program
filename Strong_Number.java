import java.util.*;
class Strong_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int res=0;
		while(num!=0)
		{
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact=i*fact;
			}
			res=res+fact;
			num=num/10;
		}
		if(num1==res)
			System.out.println("Strong number");
		else
			System.out.println("not Strong number");
		
	}
}
