import java.util.Iterator;

public class EvenIterator implements Iterator<Integer>
{

	private int current = 0; 
	private boolean negative;
	
	public boolean hasNext()
	{
		return true;
	}
	
	public Integer next()
	{
		int temp = current;
		if(negative)
			current +=2;
		else
			temp /= -1;
		negative = !negative;
		
		
		
		return temp;
	}
}