import java.util.Arrays;

public class EqualSidesOfAnArray
{
    public static int findEvenIndex(int[] arr)
    {
       if(arr.length < 3) return -1;
        for (int i = 1; i < arr.length ; i++)
        {
            if(Arrays.stream(Arrays.copyOfRange(arr,0,i)).sum() == Arrays.stream(Arrays.copyOfRange(arr,i+1,arr.length)).sum())
                return i;

        }
        return -1;
    }
}
