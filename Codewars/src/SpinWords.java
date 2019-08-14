public class SpinWords
{
    public static  String spinWords(String sentence)
    {
        String S="";
        String Words[] = sentence.split("\\s*(\\s|,|!|\\.)\\s*");
        for(int i =0;i<Words.length;i++)
        {
            if(Words[i].length()>= 5)
            {
                for(int z = Words[i].length()-1;z >= 0; z--)
                {

                    S += Words[i].charAt(z);

                }

            }
            else
            {
                S+=Words[i];
            }
            if(i+1 != Words.length) S += " ";
        }


     return S;
    }

}
