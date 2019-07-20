


public class BubbleSort
{
    private Integer array[];

    public BubbleSort(Integer array[])
    {
        this.array = array;
    }

    public Integer[] Sort()
    {
        for (int i = 0; i < array.length -1;i++)
        {
            for (int j = array.length - 1; j > i; j--)
            {
                if (array[j] < array[j-1])
                {
                    int temp;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
