import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class High_Low
{
    public static String HighAndLow(String numbers)
    {
        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer:: parseInt).toArray();
        Arrays.sort(array);
        // Code here or

        return array[array.length-1] + " " + array[0];
    }
}
