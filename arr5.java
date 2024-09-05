import java.util.*;
class arr5
{  
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in); 
		int arr[]= new int[5]; 
		for(int i=0;i<5;i++)
		{
			System.out.println("\nEnter %d position element " + i+1);
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("\nSorted Array is : "+ Arrays.toString(arr));
		System.out.println("\nMinimum is : "+ arr[0]);
		System.out.println("\nMaximum is : "+ arr[4]);
	}
}  