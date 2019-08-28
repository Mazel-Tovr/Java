import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dinglemouse
{
    /*
            10
            #
            #
        7   #
        #   #
        #   #     5
        #   #     #
        # 3 #     #
        # # #     #
        # # # 1   #
        # # # #   #
        -----------
        1 2 3 4 5 6


        expected:<[]-----------1 2 3 4 ...> but was:<[]-----------1 2 3 4 ...>
     */
    public static String histogram(final int results[])
    {
        String s="";String ss="";
        int max = 0;
        for(int i = 0;i<results.length;i++)
        {
            if(results[i] > max) max = results[i];
        }
        String[] Answer = new String[max+3];
        for(int i = 1;i<results.length+1;i++)
        {
            s+=i+" ";
            ss+="--";
        }
        s = new StringBuilder(s).replace(s.length()-1,s.length(),"\n").toString();
        ss = new StringBuilder(ss).replace(ss.length()-1,ss.length(),"\n").toString();
        Answer[0] = s;Answer[1] = ss;s="";ss="";

        for(int i = 2;i<Answer.length;i++)
        {
            for(int z = 0;z<results.length;z++)
            {
                if(results[z] >= i-1 )
                {
                    s+="# ";
                }
                else
                {
                    if(results[z] == i-2) s += i-2 == 0 ? "  ": results[z] >= 10 ? +(i-2) :(i-2)+" " ;
                    else s +="  ";
                }

            }

                for (int c = s.length() - 1; c >= 0; c--) {
                    if (s.charAt(c) == ' ')
                    {
                        s = new StringBuilder(s).deleteCharAt(c).toString();
                    } else {
                        break;
                    }
                }

            
            Answer[i] = s.length() == 0 ? s : s+"\n";
            s = "";
        }
       for(int c = Answer.length-1;c>=0;c--)
       {
           ss+=Answer[c];
       }
        return ss;
    }

    /*
    6|##### 5
    5|
    4|# 1
    3|########## 10
    2|### 3
    1|####### 7
     */
    public static String histogram1(final int results[])
    {
        String s ="";
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;i<results.length;i++)
        {
            s += (i+1)+"|";
            for(int z = 0; z<results[i];z++)
            {
                s+="#";
            }
            s+= results[i]>0 ? " "+results[i]+"\n" : "\n";
            arrayList.add(s);
            s="";
        }
        for(int i = arrayList.size()-1;i>=0;i--)
        {
            s+=arrayList.get(i);
        }

        return s;
    }
}
