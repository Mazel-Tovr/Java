public class MergeSort
{

    private Integer[] array;

    public MergeSort(Integer[]array)
    {
        this.array = array;
    }
    private int Section(Integer array[],int start,int end)
    {
        int startmarker = start;
        for (int i = start;i <= end;i++)
        {
            if ( array[i] <= array[end] )
            {
                int temp = array[startmarker]; // swap
                array[startmarker] = array[i];
                array[i] = temp;
                startmarker += 1;
            }
        }
        return startmarker - 1;
    }

    public void Quicksort(Integer array[],int start, int end)
    {
        if ( start >= end )
        {
            return;
        }
        int pivot = Section(array, start, end);
        Quicksort (array,start, pivot-1);
        Quicksort (array,pivot+1, end);

    }
    public Integer[] GetSortedArray(int start, int end)
    {
        Quicksort(array,start,end);
        return array;
    }
}


