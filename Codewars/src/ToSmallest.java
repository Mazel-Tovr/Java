public class ToSmallest
{
    /*
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
     */
    public static long[] smallest(long n)
    {
        String Str = String.valueOf(n);
        Integer a[] = new Integer[Str.length()];
        for (int i = 0; i<a.length;i++)
        {
            a[i] = Character.getNumericValue(Str.charAt(i));    //Заносим число в массив (каждая цифра отдельный элемент)
        }
        int min = a[0];//Берем первое число как самое минимальное на данный момент
        int minind = 0;//Берем индекс самого минимального числа на данный момент,чтоб знать откуда его удалять
        int startposition = 0;//Стартовая позиция для того, чтобы вставить минимальное число в эту позицию
        boolean chekbreak = true;//для проблемного условия 
        while (true)
        {
                /*
                Проблемное условия заключается в том что нам при таком раскладе "20676" нужно не 0 выносить вперед (затем удалять),
                а двойку на место нуля , поэтому я написал костыль который +- работает 
                рандомные тесты пройти не могу хз why
                */
            for(int i = 1;i<a.length;i++) 
            {
                if(a[i]==0)
                {
                    startposition++;
                    chekbreak =false;
                }
                if(a[i] != 0 && a[i]<= min && a[i-1] == 0)
                    startposition++;
                else break;
            }
            //так ну тот все дожно быть понятно мы ишем минимальное число и место куда его вставить
            if(minind == startposition && chekbreak)
            {
                boolean chek = true;
                minind++;
                for (int i = minind; i < a.length; i++)
                {
                    if (min >= a[i])
                    {
                        min = a[i];
                        minind = i;
                        chek = false;
                    }
                }
                min = a[minind];
                if(chek)startposition++;
            }
            else
            {
                break;
            }
        }
        //Тут ваставка нужного числа
        Str = chekbreak ? ((new StringBuilder(Str)).insert(startposition,a[minind]).deleteCharAt(minind+1).toString()) : (new StringBuilder(Str)).insert(startposition+1,a[minind]).deleteCharAt(minind).toString() ;
        //Тут нули убираем которые впреди
        for(int i = 0;i<Str.length();i++)
        {
            if (Str.charAt(0) == '0')
            {
                Str = new StringBuilder(Str).deleteCharAt(0).toString();
                i--;
            }
        }
        return new long[]{Long.decode(Str),minind , startposition};// your code
    }
}
