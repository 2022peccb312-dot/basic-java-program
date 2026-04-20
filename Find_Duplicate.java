import java.util.*;
class Find_Duplicate 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		int duplicate=0;
		for(int i=0;i<arr.length;i++)
		{
             if(arr[i]==Integer.MAX_VALUE)
			{
				 continue;
			}
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && count==0)
				{
					count++;
					arr[j]=Integer.MAX_VALUE;
	                System.out.println("Duplicate:" + arr[i]);
				}
			}
				
		}
		
	
	}
}
