public class SumofDigits
{
/*
digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6
 */

    public static int digital_root(int n)
    {
        if(String.valueOf(n).length() == 1) return n;
        StringBuilder tempNumber = new StringBuilder(String.valueOf(n));
        int sumOfSequences = Integer.MAX_VALUE;
        while (String.valueOf(sumOfSequences).length() != 1)
        {
            sumOfSequences = 0;
            for (int i = 0; i < tempNumber.length();i++)
            {
               sumOfSequences += Integer.parseInt(String.valueOf(tempNumber.charAt(i)));
            }
            tempNumber = new StringBuilder(String.valueOf(sumOfSequences));
        }
        return  sumOfSequences;
    }
//i am so dump i just could write like this (some number)%9
}
