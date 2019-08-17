import java.util.*;

public class SmileFaces
{
    public static int countSmileys(List<String> arr)
    {
        int count=0;
        for (var item:arr)
        {
            if((item.charAt(0) == ':' || item.charAt(0) == ';') && (item.charAt(item.length()-1) == 'D' || item.charAt(item.length()-1) == ')'))
        {
            if(item.length() == 3 && (item.charAt(item.length()-2) == '-' || item.charAt(item.length()-2) == '~'))
            {
                count++;
            }
            if(item.length() == 2)
            {
                count++;
            }
        }

        }
        // Just Smile :)
        return count;
    }
}
