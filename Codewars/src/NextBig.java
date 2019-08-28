import java.util.ArrayList;
import java.util.Collections;

public class NextBig
{
    public static long nextBiggerNumber(long n)
    {
       final StringBuilder str = new StringBuilder(String.valueOf(n));
        ArrayList<Long> arrayList =new ArrayList<>();
        long c;
        if(str.length() == 1) return -1;
        for(int i = 0;i<str.length()-1;i++)
        {
            arrayList.add(swap(i+1,str));

        }

        return nextBiggerNumber(whatisnext(arrayList,n));
    }

    private static long swap(int index,StringBuilder str)
    {
        StringBuilder str2 =  new StringBuilder(str);
        char number = str2.charAt(index);
        str2.deleteCharAt(index);
        str2.insert(index-1,number);
        str2 = str2.charAt(0)== '0' ? str2.deleteCharAt(0) : str2;
        return Long.decode(str2.toString());
    }
    private static long whatisnext(ArrayList<Long> list,long n)
    {
        long c = -1;
        Collections.sort(list);
        for (var item: list)
        {
          if(item > n)
          {
              c = item;
              break;
          }
        }
        return c;
    }
}
