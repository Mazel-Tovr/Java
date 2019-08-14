public class PigLatin
{
    /*
    Move the first letter of each word to the end of it, then add "ay" to the end of the word.
    Leave punctuation marks untouched.
    Examples
    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
    pigIt('Hello world !');     // elloHay orldway !
    */
    public static String pigIt(String str)
    {
       StringBuilder strok = new StringBuilder(str);
       int count = 0;
       String str2 = "";
       String Answer = "";
       while (strok.length()>0)
       {
           char symbol = strok.charAt(count);
           str2 += symbol;
           if ( !((Character.toLowerCase(strok.charAt(count)) >= 'a') && (Character.toLowerCase(strok.charAt(count)) <= 'z')) || strok.length() == count+1)
           {
               strok.delete(0 ,count+1);
               StringBuilder strok2 = new StringBuilder(str2);
               char c = strok2.charAt(0);
               if(c != ' '&& c != '!'&& c != ',' && c!= '.'&& c!= '?')
               {
                   strok2.deleteCharAt(0);
                   int length = strok2.length() - 1;
                   if (length > 0) {
                       if ((Character.toLowerCase(strok2.charAt(length)) >= 'a') && (Character.toLowerCase(strok2.charAt(length)) <= 'z')) {
                           strok2.insert(strok2.length(), c);
                           strok2.insert(strok2.length(), "ay");
                       } else {
                           strok2.insert(strok2.length() - 1, c);
                           strok2.insert(strok2.length() - 1, "ay");
                       }
                   } else {

                       strok2.insert(0, "ay");
                       strok2.insert(0, c);

                   }
               }
               Answer += strok2.toString();
               str2 = "";
               count = -1;
           }
           count++;
       }

       return Answer;
    }
}
