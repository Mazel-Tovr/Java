import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Interval
{
    /*
    // null argument
    Interval.sumIntervals(null);  // => 0

    // empty intervals
    Interval.sumIntervals(new int[][]{});  // => 0
    Interval.sumIntervals(new int[][]{2,2}, {5,5});  // => 0

    // disjoined intervals
    Interval.sumIntervals(new int[][]{
      {1,2},{3,5}
        });  // => (2-1) + (5-3) = 3

    // overlapping intervals
    Interval.sumIntervals(new int[][]{
      {1,4},{3,6},{2,8}
    });  // [1,8] => 7
     */
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) return 0;
        int sum = 0;
        //лист ключей
        List keyList = new ArrayList();
        //лист значений
        List valueList = new ArrayList();
        for (int i = 0; i < intervals.length; i++)
        {
            keyList.add(intervals[i][0]);
            valueList.add(intervals[i][1]);
        }

            for (int i = 0; i < keyList.size(); i++)
            {
                boolean check = true;

                for (int z = i + 1; z < keyList.size(); z++)
                {

                    if ((((Integer) keyList.get(i) <= (Integer) keyList.get(z) && (Integer) keyList.get(z) <= (Integer) valueList.get(i)) || ((Integer) keyList.get(i) <= (Integer) valueList.get(z) && (Integer) valueList.get(z) <= (Integer) valueList.get(i)))||
                            (((Integer) keyList.get(z) <= (Integer) keyList.get(i) && (Integer) keyList.get(i) <=(Integer) valueList.get(z))||( ((Integer) keyList.get(z) <= (Integer) valueList.get(i) && (Integer) valueList.get(i) <=(Integer) valueList.get(z)))))
                    {
                        int array[] = new int[]{(Integer) keyList.get(i), (Integer) valueList.get(i), (Integer) keyList.get(z), (Integer) valueList.get(z)};
                        Arrays.sort(array);
                        keyList.remove(i);
                        keyList.remove(z - 1);
                        valueList.remove(i);
                        valueList.remove(z - 1);
                        keyList.add(i, array[0]);
                        valueList.add(i, array[array.length - 1]);
                        check = false;

                    }
                }
                if (!check) i=-1;
            }

        for(int i = 0;i<keyList.size();i++)
        {
            sum +=(Integer)valueList.get(i) - (Integer)keyList.get(i);
        }

        return sum;

        /*
        во я дэбил, а задача так легко решалась
          if(intervals == null)
        {
          return 0;
        }
        HashSet<Integer> ints = new HashSet<Integer>();
        for(int i=0; i<intervals.length; i++)
        {
          for(int j=intervals[i][0]; j<intervals[i][1]; j++)
          {
            ints.add(j);
          }
        }
        return ints.size();
         */

    }
}
