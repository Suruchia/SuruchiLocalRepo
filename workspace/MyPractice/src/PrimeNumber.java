
public class PrimeNumber {

	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		int i;
		for ( i=2; i<n; i++)  // can also put i<n/2
		{
				if(n%i==0)
				{
				System.out.println("number is not a prime number");
				break;
				}
		}

				if(i==n){
					System.out.println(" ÿour number is prime"  );
					}	
				
		
	}
}
