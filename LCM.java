import java.util.*;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int val1=0;
		int val2=0;
		for(int i=2;i<Integer.MAX_VALUE;i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.println("LCM:"+i);
				break;
			}
		}
		
		
	}
}
