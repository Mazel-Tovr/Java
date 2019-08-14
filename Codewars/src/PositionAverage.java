import java.util.Collection;

public class PositionAverage
{
    public static double posAverage(String s)
    {
        int incommoncount = 0;
       String Words[] = s.split("\\s*(\\s|,|!|\\.)\\s*");
       if(Words.length >= 2)
       {
           int n = Words[0].length();
           for(int i = 0;i<Words.length-1;i++)
           {
               for(int a = i+1;a<Words.length;a++)
               {
                   for (int z = 0; z < n; z++) {
                       if (Words[i].charAt(z) == Words[a].charAt(z))
                           incommoncount++;

                   }
               }

           }
       }
     return  (double) incommoncount/(((Words.length*(Words.length -1))/2)*Words[0].length())*100;  // your code
    }
}
