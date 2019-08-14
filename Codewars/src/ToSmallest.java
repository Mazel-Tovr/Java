public class ToSmallest
{
    /*
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
     */
    public static long[] smallest(long n)
    {
        String Str = String.valueOf(n);
        Integer a[] = new Integer[Str.length()];
        for (int i = 0; i<a.length;i++)
        {
            a[i] = Character.getNumericValue(Str.charAt(i));
        }
        int min = a[0];
        int minind = 0;
        int startposition = 0;
        boolean chekbreak = true;
        while (true)
        {

            for(int i = 1;i<a.length;i++)
            {
                if(a[i]==0)
                {
                    startposition++;
                    chekbreak =false;
                }
                if(a[i] != 0 && a[i]<= min && a[i-1] == 0)
                    startposition++;
                else break;
            }

            if(minind == startposition && chekbreak)
            {
                boolean chek = true;
                minind++;
                for (int i = minind; i < a.length; i++)
                {
                    if (min >= a[i])
                    {
                        min = a[i];
                        minind = i;
                        chek = false;
                    }
                }
                min = a[minind];
                if(chek)startposition++;
            }
            else
            {
                break;
            }
        }

        Str = chekbreak ? ((new StringBuilder(Str)).insert(startposition,a[minind]).deleteCharAt(minind+1).toString()) : (new StringBuilder(Str)).insert(startposition+1,a[minind]).deleteCharAt(minind).toString() ;
        for(int i = 0;i<Str.length();i++)
        {
            if (Str.charAt(0) == '0')
            {
                Str = new StringBuilder(Str).deleteCharAt(0).toString();
                i--;
            }
        }
        return new long[]{Long.decode(Str),minind , startposition};// your code
    }
}
