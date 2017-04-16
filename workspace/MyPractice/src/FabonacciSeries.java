
public class FabonacciSeries {
	public static void main(String args[])
	{
		int prev , next , sum ;
		int n = Integer.parseInt(args[0]);
		System.out.println(Integer.parseInt(args[0]));
		prev=0;
		next=1;
		for (int i=0 ;next<=n; i++)
		{
			
			sum = prev+next;
			prev=next;
			next= sum;
			System.out.print(prev);
		}
	}

}
