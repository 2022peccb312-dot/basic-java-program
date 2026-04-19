import java.util.Scanner;
class Count_Digit_until_single
{
	public static int unit_digit(int num)
	{
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			res=res+rem;
			num/=10;
		}
		return res;
	}
			
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>9)
		{
			num=unit_digit(num);
		}
		System.out.println(num);
	}
}
