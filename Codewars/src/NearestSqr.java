
public class NearestSqr
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
}
