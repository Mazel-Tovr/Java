import java.math.BigInteger;

public class Primorial
{
    public static String numPrimorial(int n)
    {
        BigInteger a =  BigInteger.valueOf(2);
        int z = 2;
        while (n>1)
        {
            if(IsSimple(z+=1))
            {
                a = a.multiply(BigInteger.valueOf(z));
                n--;
            }
        }

        return String.valueOf(a); // Do your magic!
    }

    private static boolean IsSimple(int ANum)
    {
        if (ANum < 2)
            return false;
        double s = Math.sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }
}
