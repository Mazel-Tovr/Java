import java.lang.reflect.Array;
import java.util.ArrayList;

public class EnoughIsEnough
{
    /*
    Task
    Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
    For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2],
    drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
     */
    public static int[] deleteNth(int[] elements, int maxOccurrences)
    {
        ArrayList<Integer> List = new ArrayList<Integer>();
        ArrayList<Integer> DoneElems = new ArrayList<Integer>();
        for (int i: elements)
        {
         List.add(i);
        }
        for(int i =0 ;i < List.size();i++)
        {
         if(!(DoneElems.contains(List.get(i))))
            {
                int a = List.get(i);
                int count=0;
                for(int z = 0;z < List.size();z++)
                {
                    if(List.get(z) == a)
                    {
                        count++;
                        if(count>maxOccurrences)
                        {

                            List.remove(z);
                            z--;

                        }
                    }

                }
                count = 0;
                i--;
                DoneElems.add(a);
            }

        }
        int [] mass = new int[List.size()];
        for (int i=0;i<List.size();i++)
        {
            mass[i] = List.get(i);
        }
        return mass;


    }
}
