public class MissingLetter
{
    public static char findMissingLetter(char[] array)
    {
        char[] alf = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if(Character.isUpperCase(array[0]))
        {
            for (int i = 0; i < alf.length; i++)
            {
                    alf[i] = Character.toUpperCase(alf[i]);
            }
        }
        int startindex = 0;
        for (int i = 0; i < alf.length; i++)
        {
            if(alf[i]==array[0])
            {
                startindex = i;
                break;
            }

        }
        char answer= ' ';
        for (int i = 0; i <array.length ; i++ ,startindex++)
        {
               if(array[i] != alf[startindex])
               {
                   answer = alf[startindex];
                   break;
               }

        }


        return answer;
    }
}
