import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator<Integer>
{
	private int counter = -1;
	private int[] arr = {45, 2, -6, 88, 124, 17, 25};
	
	public Integer next()
	{
		if(hasNext())
		{
			counter++;
			return arr[counter];
		}
		else
			throw new NoSuchElementException("No more numbers in the array");
	}
	
	
	
	public boolean hasNext()
	{
		return(counter < arr.length);
	}
	
}