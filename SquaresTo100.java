import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

/**
*Iterates thorough 0 to 100 inclusive
*/
public class SquaresTo100 implements Iterator<Integer>
{

	private int n = -1;
	
	public Integer next()
	{
		if(hasNext())
		{
			n++;
			return n*n;
		}
		
		else
			throw new NoSuchElementException("Squares only up to 100");
		
		
	}
	
	public boolean hasNext()
	{
		return n < 10;
	}
	
	public void remove()
	{
		throw new UnsupportedOperationException("Squares cannot be removed.");
	}	
}