
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=1;i<=100;i++)
		{
			int x=0;
			for(j=1;j<=i;j++)
			{	
				if(i%j==0)
					x++;
			}
		if(x==2)
		{
			
		System.out.print(i+" ");
			
		}
		}
	}
}


