import java.util.HashSet;

public class PangramChecker 
	{
    public static boolean isPangram(String input)
		{
        
        input = input.replaceAll(" ", "").toLowerCase();
        
        if (input.length() < 26)
			{
            return false; 
        }
        
        HashSet<Character> set = new HashSet<>();
        
        for (char c : input.toCharArray())
			{
            if (c >= 'a' && c <= 'z') 
				{
                set.add(c);
            }
        }
        
        return set.size() == 26;
    }

    public static void main(String[] args)
		{
        String sentence = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(sentence);
        
        if (isPangram)
			{
            System.out.println("The input is a pangram.");
        } else 
			{
            System.out.println("The input is not a pangram.");
        }
    }
}
	