import java.util.ArrayList;

public class EasyTask
{
    public static int nearestSq(final int n)
    {
        Double number = Math.sqrt(n);
        int a = (int)Math.round(number);
        return a*a;

    }

    public static String repeatStr(final int repeat, final String string)
    {
        String s = "";
        for(int i = 0;i < repeat;i++)
        {
            s +=string;
        }
        return s;
    }
    public int adjacentElementsProduct(int[] array)
    {
        int currentmax= -9999999;
        for (int i = 1;i<array.length;i++)
        {
            int a = array[i-1]*array[i];
            if(currentmax<a)currentmax = a;
        }
        return currentmax;
    }
    public static String countingSheep(int num)
    {
        String S = "";
        for(int i = 0;i<num;i++)
        {
            S += i+" sheep...";
        }
        return S;
    }

    public static int rowSumOddNumbers(int n) {
        ArrayList<Integer> Answer = new ArrayList<>();
        int step = 1;
        int number = 1;
        for (int i = 0; i < n; i++)
        {
            int tepm =0;
            for(int z = 0;z<step;z++)
            {
                tepm += number;
                number+=2;
            }
            Answer.add(tepm);
            step++;
        }

        return Answer.get(n-1);
    }

    public static String solve(final String str)
    {
        String s ="";
        int upcount =0;
        int lowcount =0;
       for (int i = 0;i<str.length();i++)
       {
           if(Character.isUpperCase(str.charAt(i)))
               upcount++;
           else
               lowcount++;

       }
       if(lowcount >= upcount)
          s = str.toLowerCase();
       else
          s = str.toUpperCase();
       return s;
    }

}
