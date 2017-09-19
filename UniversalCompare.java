import java.util.Comparator;
import java.util.Comparable;

public class UniversalCompare implements Comparator
{
	public int compare(Comparable c1, Comparable c2)
	{
		return c1.compareTo(c2);
	}
}