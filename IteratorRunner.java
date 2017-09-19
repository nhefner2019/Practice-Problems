import java.util.Iterator;

public class IteratorRunner
{
	public static void main(String[] args)
	{
		Iterator<Integer> i = new EvenIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}	
}