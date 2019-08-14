public class Diamond
{
    public static String print(int n)
    {
        if (n % 2 == 0|| n < 0) return null;
        if(n == 1) return "*\n";
        String s="";
        char star = '*';
        char space = ' ';
        int spacecount = 0;
        for(int i=1;i<n;i+=2) spacecount++;
        int starcount = 1;
        boolean check = true;
        for (int i = 1;i<=n;i++)
        {
            if (check == true)
        {
            if(spacecount != 0)
            {
                for(int z = 0;z<spacecount;z++)
                {
                    s+=space;
                }
                spacecount -=1;
            }

            for (int z = 0;z<starcount;z++)
            {
                s+=star;
            }
            s+= "\n";
            starcount +=2;
            if(starcount > n)
            {
                starcount -= 2;
                check = false;

            }
        }
        else
            {
                spacecount +=1;
                starcount -=2;
                for(int z = 0;z<spacecount;z++)
                {
                    s+=space;
                }
                for (int z = 0;z<starcount;z++)
                {
                    s+=star;
                }
                s+= "\n";
            }
        }

    return String.format(s);
    }
}
