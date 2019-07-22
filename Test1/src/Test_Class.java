import java.util.*;

public class Test_Class
{
     public static void main(String[] args)
     {
     //System.out.println("Hello World");
     //System.out.println("Я даун пишу сортировки на Java");

     //BubbleSortStart();Done
     //MergeSort();
         BinSearch();

     }

 private  static  void BinSearch()
 {
     System.out.println("BubbleSort☺");
     Random rnd = new Random();
     Integer array[] = new Integer[50];
     for (int i = 0; i < 50;i++)
     {
         array[i] = rnd.nextInt(51);
     }
     System.out.println("Массив");
     BubbleSort SortedArray = new BubbleSort(array);
     array = SortedArray.Sort();
     PrintArray(array);

     BinarySearch BinSearch = new BinarySearch();
     System.out.println("Элемент который ищу "+array[10]);
     System.out.println("Элемент находится на позиции Rec "+BinSearch.BinarySearch_Rec(array,array[10],0,array.length));
     System.out.println("Элемент находится на позиции Iter "+BinSearch.BinarySearch_Iterational(array,array[10]));


 }

  private  static void BubbleSortStart()
     {
          System.out.println("BubbleSort☺");
          Random rnd = new Random();
          Integer array[] = new Integer[50];
          for (int i = 0; i < 50;i++)
          {
               array[i] = rnd.nextInt(51);
          }
          System.out.println("Изначальный массив");
          PrintArray(array);
          BubbleSort SortedArray = new BubbleSort(array);
          array = SortedArray.Sort();
          System.out.println("Sorted массив");
          PrintArray(array);
     }

     //Полная хуйня
     private  static void MergeSort()
     {
          System.out.println("MergeSort☺");
          Random rnd = new Random();
          Integer array[] = new Integer[50];
          for (int i = 0; i < 50;i++)
          {
               array[i] = rnd.nextInt(51);
          }
          System.out.println("Изначальный массив");
          PrintArray(array);
          MergeSort SortedArray = new MergeSort(array);
          System.out.println("Sorted массив");
          PrintArray(SortedArray.GetSortedArray(array[0],array[array.length-1]));
     }
     private static void PrintArray(Integer array[])
     {
          for (int i = 0;i < array.length;i++)
          {
               System.out.print(array[i]+ " ");
          }
          System.out.println();
     }
}
