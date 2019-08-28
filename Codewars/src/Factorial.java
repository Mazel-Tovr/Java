public class Factorial
{

    public static String Factorial1(int n)
    {
        return factoriall(n, 300);
    }

    private static String factoriall(int n, int maxSize)
    {
        int res[] = new int[maxSize];
        res[0] = 1; // Initialize result
        int res_size = 1;

        // Apply simple factorial formula n! = 1 * 2 * 3 * 4... * n
        for (int x = 2; x <= n; x++)
        {
            res_size = multiply(x, res, res_size);
        }

        StringBuffer buff = new StringBuffer();
        for (int i = res_size - 1; i >= 0; i--) {
            buff.append(res[i]);
        }

        return buff.toString();
    }

    private static int multiply(int x, int res[], int res_size)
    {
        int carry = 0;

        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

}
