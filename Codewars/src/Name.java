public class Name
{
    public static boolean nameInStr(String str, String name)
    {
       while ((str.length() > 0) && (name.length() > 0))
       {
           int a = str.length();
           if(str.charAt(0) == name.charAt(0))
           {
               name = new StringBuilder(name).deleteCharAt(0).toString();
               str = new StringBuilder(str).deleteCharAt(0).toString();
           }
           else str = new StringBuilder(str).deleteCharAt(0).toString();


       }
        return name.length() == 0 ? true: false;
    }
}
