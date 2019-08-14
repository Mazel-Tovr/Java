import java.lang.reflect.Array;
import java.util.ArrayList;

public class CamelCase
{
    public static String camelCase(String str)
    {
        ArrayList<Character> string = new ArrayList<>();
        String s= "";
        for (int i = 0;i<str.length();i++)
        {
            string.add(str.charAt(i));
        }
        boolean check =true;
        for (int i = 0;i<string.size();i++)
        {
            if(check)
            {
                string.set(i,Character.toUpperCase(string.get(i)));
                check =false;
            }
            if(string.get(i)==' ')
            {
                string.remove(i);
                i--;
                check = true;
            }
        }
        for (var item:string)
        {
         s +=item;
        }

        return s;
    }

    public static String camelCase2(String str) {

        if (str.length() == 0)
            return "";



        str = str.trim();

        String[] words = str.split("\\s*(\\s|,|!|\\.)\\s*");

        for (int i = 0; i < words.length; i++) {

            //char titleLetter = Character.toUpperCase(words[i].charAt(0));

            StringBuffer strB = new StringBuffer(words[i]);
            strB.setCharAt(0, Character.toUpperCase(strB.charAt(0)));
            words[i] =strB.toString();

        }

        return String.join("", words);
    }
}
