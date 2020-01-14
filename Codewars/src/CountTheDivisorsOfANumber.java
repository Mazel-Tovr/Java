public class CountTheDivisorsOfANumber
{
    /*
    divisors 4  = 3 -- 1, 2, 4
divisors 5  = 2 -- 1, 5
divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30
     */


    public long numberOfDivisors(int n)
    {
        int count = 0;
        for (int i = 1; i <= n ; i++)
        {
            if(n%i== 0)count++;
        }
        return count;
    }
}
