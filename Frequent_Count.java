import java.util.*;

class Frequent_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==Integer.MAX_VALUE)
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]==arr[j])
				{
					arr[j]=Integer.MAX_VALUE;
					count++;
				}
			}
			System.out.println( arr[i] + ":" + count);
		}
		
		
		
	}
}
