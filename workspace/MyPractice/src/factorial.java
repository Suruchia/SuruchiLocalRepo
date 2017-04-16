
public class factorial {
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int fact=n;
		for (int i =n ;i>1;i--)
		{
			fact = fact(fact,(i-1));
		}
		System.out.println(fact);
	}
		
		public static int fact(int i , int j)
		{
			int factorial= i*j;
			return factorial;
		}
	}


