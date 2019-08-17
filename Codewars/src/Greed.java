import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Greed
{
    public static int greedy(int[] dice)
    {
       int points = 0;
       HashMap<Integer,Integer> Dublicats = new HashMap<>();
        ArrayList<Integer> Array =new ArrayList<>();
       for(int i = 0 ; i< dice.length;i++)
       {
           Array.add(dice[i]);
       }
       for(int i = 0 ; i< Array.size();i++)
       {
           int temp = Array.get(i);
           int count = 0;
           for(int z = 0 ; z< Array.size();z++)
           {
               if(temp == Array.get(z))
               {
                   count++;
                   Array.remove(z);
                   z--;
               }
           }
           Dublicats.put(temp,count);
           i--;
       }
        for(HashMap.Entry<Integer, Integer> item : Dublicats.entrySet())
        {
            points +=getpoint(item.getKey(),item.getValue());
        }

        return points;
    }

    private static int getpoint(Integer digit,Integer count)
    {
        if(digit == 1 && count == 3) return 1000;
        else if(digit == 6 && count == 3) return 600;
        else if(digit == 5 && count == 3) return 500;
        else if(digit == 4 && count == 3) return 400;
        else if(digit == 3 && count == 3) return 300;
        else if(digit == 2 && count == 3) return 200;
        else if(digit == 1 && count == 1) return 100;
        else if(digit == 5 && count == 1) return  50;
        else if(count == 2)
        {
            int points = 0;
            points += getpoint(digit,count-1);
            points += getpoint(digit,count-1);
            return points;
        }
        else if(count == 4)
        {
            int points = 0;
            points += getpoint(digit,count-1);
            points += getpoint(digit,count-3);
            return points;
        }
        else if(count == 5)
        {
            int points = 0;
            points += getpoint(digit,count-2);
            points += getpoint(digit,count-3);
            return points;
        }
        else return 0;
     }
}
