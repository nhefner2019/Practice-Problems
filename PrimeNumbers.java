import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;


public class PrimeNumbers implements Iterator<Integer>
{

	private int n = 2;
	private int primeCount = 0;
	
	public Integer next()
	{
		
		if(hasNext())	
		{	
			while(!isPrime(n))
			{
				n++;
			}
			primeCount++;
			return n++;
		}
		
		else
			throw new NoSuchElementException("Only first 20 prime numbers");
	}
	
	public boolean hasNext()
	{
		return primeCount < 30;
	}
	
	public boolean isPrime(int n)
	{
		int count = 0;
		for(int i = 2; i <= n/2; i++)
		{
			if(n%i == 0)
				count++;
		}
		
		if(count > 0)
			return false;
		else
			return true;
	}
	
}