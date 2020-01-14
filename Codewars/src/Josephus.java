import java.util.ArrayList;
import java.util.List;

public class Josephus
{
    /*
    [1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out and goes into the result [3]
[1,2,4,5,7] => 6 is counted out and goes into the result [3,6]
[1,4,5,7] => 2 is counted out and goes into the result [3,6,2]
[1,4,5] => 7 is counted out and goes into the result [3,6,2,7]
[1,4] => 5 is counted out and goes into the result [3,6,2,7,5]
[4] => 1 is counted out and goes into the result [3,6,2,7,5,1]
[] => 4 is counted out and goes into the result [3,6,2,7,5,1,4]
     */
    public static <T> List<T> josephusPermutation(final List<T> items, final int k)
    {
        List<T> answer = new ArrayList<>();
        int jumpindex = 0;
        while (items.size() > 0)
        {
            for (int i = 0; i <items.size(); i++)
            {
                jumpindex++;
                if(jumpindex == k)
                {
                    answer.add(items.get(i));
                    items.remove(i);
                    i--;
                    jumpindex = 0;
                }
            }
            if(items.size() == 1)
            {
                answer.add(items.get(0));
                items.remove(0);
            }
        }
        return answer;
    }
}