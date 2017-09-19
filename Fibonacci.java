import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;


public class Fibonacci implements Iterator<Integer>
{

	private int current = 1;
	private int previous = 1;
	private int temp;
	private int count = 2;
	
	public Integer next()
	{
		if(hasNext())
		{
			count++;
			
			temp = current + previous;
			previous = current;
			current = temp;
			
			return temp;
			
		}
		
		else
			throw new NoSuchElementException("Squares only up to 100");
	}
	
	public boolean hasNext()
	{
		if(count > 20)
			return false;
			
		else if(count < 2)
			return false;
		else
			return true;
	}
	
}