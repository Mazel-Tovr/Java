
import java.util.ArrayList;
/*
Task
 	In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
 	 You will be passed a string and you must return that string in an array where an uppercase
 	  letter is a person standing up.
Rules
 	1.  The input string will always be lower case but maybe empty.
    2.If the character in the string is whitespace then pass over it as if it was an empty seat.
Example

wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */
public class MexicanWave
{
    public static String[] wave(String str)
    {
        ArrayList<String> Answer = new ArrayList<String>();
        char[] array = str.toCharArray();
        for (int i = 0 ;i< str.length();i++)
        {
            if(array[i] != ' ')
            {
                String s="";
                array[i] = Character.toUpperCase(array[i]);
                for (var elems:array)
                {
                    s +=elems;
                }
                Answer.add(s);
                array[i] = Character.toLowerCase(array[i]);
            }

        }

        return Answer.toArray(new String[Answer.size()]);
    }
}
