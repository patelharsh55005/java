import java.util.*;
class utility
{
	public static long factorial(long no)
	{
		long r = 1;
		for(long i=1;i<no+1;i++)
		{
			r = r * i;
		}
		System.out.println("Factorial : " + r);
		return r;
		
	}
	public static boolean isPrime(int no)
	{
		boolean f = false;
		for(int i = 1;i<no;i++)
		{
			if(i % 2 == 0)
			{
				f = true;
			}
			else
			{
				f = false;
			}
		}
		System.out.println("isPrime : " + f);
		return f;
		
	}
	public static boolean isEven(long no)
	{
		boolean f = false;
		if(no % 2 == 0)
		{
			f = true;
		}
		else
		{
			f = false;
		}
		System.out.println("isEven : " + f);
		return f;
		
	}
	public static boolean isOdd(long no)
	{
		boolean f = false;
		if(no % 2 == 1)
		{
			f = true;
		}
		else
		{
			f = false;
		}
		System.out.println("isOdd : " + f);
		return f;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//int no;
		//int n;
		long no;
		System.out.println("Enter no. : ");
		no = sc.nextLong();
		//no = (long)n;
		
		factorial(no);
		isPrime((int)no);
		isEven(no);
		isOdd(no);
	}
}