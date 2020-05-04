import java.util.Arrays;
public class ShorterMain 
{
	public static void main(String[] args) 
	{
		String[] strarr = new String[]{"banana", "apple","dragonfruit","avocado"};
		System.out.println(Arrays.toString(strarr));
		String[] alphabetized = Shorter.alphabetize(strarr);
		System.out.println(Arrays.toString(alphabetized));
		
	}
}
