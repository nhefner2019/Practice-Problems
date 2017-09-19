import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;


public class Fibonacci implements Iterator<Integer>
{

	private int current = 1;
	private int previous = 1;
	private int temp;
	private int count = -1;
	
	public Integer next()
	{
		
		count++;
		
		if(count < 2)
			return 1;
		
		else if(hasNext())
		{

			
			temp = current + previous;
			previous = current;
			current = temp;
			
			return temp;
			
		}
		

		
		else
			throw new NoSuchElementException("Only first 20 numbers of Fibonacci sequence");
	}
	
	public boolean hasNext()
	{
		if(count > 20)
			return false;
			
		else
			return true;
	}
	
}