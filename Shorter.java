public class Shorter 
{
	public static String[] alphabetize(String[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			String nextVal = array[i];
			for(int c=i; c<array.length; c++)
			{
				if(array[c].compareTo(nextVal)<0)
				{
					String temp = nextVal;
					array[i]=array[c];
					array[c] = temp;
					
				}
			}
		}
		return array;
	}
}

