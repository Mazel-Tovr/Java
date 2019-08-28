import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public static int findShort(String s)
    {
            int shortest = 9999999;
            String Words[] = s.split(" ");
            for(var item : Words)
            {
                if( shortest > item.length())
                    shortest = item.length();
            }
            return  shortest;
        }
    public static boolean solution(String str, String ending)
    {
        boolean Answer = true;
        for(int i = str.length()-1,z = ending.length()-1;i > 0 && z > 0; i-- ,z--)
        {
            if(str.charAt(i) == ending.charAt(z)) Answer = true;

            else Answer = false;
        }
        return Answer;
    }
    public static String printerError(String s)
    {

        int sum =0;int eror = 0;

        for(int i = 0;i<s.length();i++)
        {
            if('a'<= s.charAt(i) && s.charAt(i) <='m') sum++;
            else eror++;
        }
       return eror +"/"+(sum+eror);// your code
    }

    public static boolean check(Object[] a, Object x) {
        boolean answer =false;
        for (var item:a)
        {
            if (item.equals(x)) {answer =true; break;}
        }
        // Your code here
        return answer;
    }
    public static String covfefe(String tweet)
    {
        boolean check = false;
        String[] Words = tweet.split(" ");
        for (int i = 0;i<Words.length;i++)
        {
            if(Words[i].equals("coverage"))
            {
                Words[i] ="covfefe";
                check = true;
            }
            tweet += i<Words.length-1 ? Words[i]+ " ": Words[i];
        }


        return check ? tweet: tweet+" covfefe";
    }

    public static int GetAverage(int[] marks)
    {
        int a =0;
        for (var item : marks){a+=item;}
        return  a/marks.length;
    }
}
