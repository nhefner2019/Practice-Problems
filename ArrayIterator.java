import java.util.Iterator;
import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T>
{
	private int counter = -1;
	private T[] arr;
	
	public ArrayIterator(T[] a)
	{
		arr = a;
	}
	
	public T next()
	{
		counter++;
		return arr[counter];
		
	}
	
	public boolean hasNext()
	{
		return(counter < arr.length);
	}
	
}