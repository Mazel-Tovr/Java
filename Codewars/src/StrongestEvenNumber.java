public class StrongestEvenNumber
{
    public static int strongestEven(int n, int m) {
        int best = 1;

        while (true) {
            int ceiling = n / best + (n % best == 0 ? 0 : 1);
            int floor = m / best;

            if (ceiling > floor) {
                best = best / 2;

                return best * (m / best);
            }

            best *= 2;
        }
    }
}
