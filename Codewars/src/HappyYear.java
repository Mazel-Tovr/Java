public class HappyYear
{
    static public int nextHappyYear(int year)
    {
        Integer year1 = year + 1;


        while (true)
        {
            String text = year1.toString();
            int ans = 0;
            while (text.length() > 0)
            {
                String firstLetter = text.substring(0, 1);
                text = text.substring(1);
                if (text.contains(firstLetter)) ans++;
            }
            if (ans == 0)
            {
                return year1;
            }
            if (ans > 0)
            {
                if(year >=9000)
                {
                    year1 -=1;
                }
                else
                {
                    year1 +=1;
                }

            }
        }

    }
}
