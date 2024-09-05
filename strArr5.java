import java.util.*;
class strArr5
{  
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in); 
		String arr[]= new String[5]; 
		for(int i=0;i<5;i++)
		{
			System.out.println("\nEnter element " + i+1);
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		System.out.println("\nSorted Array is : "+ Arrays.toString(arr));
	}
}  