public class Persist
{
    public static int persistence(long n)
    {
        int count = 0;
        String str = String.valueOf(n);
        while (str.length() > 1)
        {
            long a = 1;
            for (int i = 0;i<str.length();i++)
            {
                a *= Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            str = String.valueOf(a);
            count++;
        }

       return count; // your code
    }
}
