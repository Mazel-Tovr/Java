import java.lang.reflect.Array;
import java.util.Arrays;

public class Meeting
{
    public static String meeting(String s)
    {
       s = s.toUpperCase();
       String Words[] = s.split(";");
       for(int i =0;i<Words.length;i++)
       {
           Swap(Words,i);
       }
       Arrays.sort(Words);
       s = "";
        for (var item: Words)
        {
            s+="("+item+")";
        }
       return s; // your code
    }
    private static void Swap(String array[],int i)
    {
        String s="";
        String a[] = array[i].split(":");
        s+=a[1]+", ";s+=a[0];
        array[i] = s;
    }
}
