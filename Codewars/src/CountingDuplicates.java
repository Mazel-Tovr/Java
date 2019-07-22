import java.util.ArrayList;

public class CountingDuplicates
{
    /*
     Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits
     that occur more than once in the input string. The input string can be assumed to contain only alphabets
     (both uppercase and lowercase) and numeric digits.
    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
     */
    public static int duplicateCount(String text)
    {
        int character_count = 0;
        ArrayList<Character> arrayList1 = new ArrayList<>() {};
        for (int i = 0; i < text.length(); i++)
        {
            arrayList1.add(text.charAt(i));
        }

        for (int i = 0; i < arrayList1.size(); i++)
        {
            int count = 0;
            char temp = arrayList1.get(i);
            for (int z = 0; z < arrayList1.size(); z++) {
                if (temp == arrayList1.get(z) || temp == Character.toUpperCase(arrayList1.get(z))||Character.toUpperCase(temp) == arrayList1.get(z))
                {
                    arrayList1.remove(z);
                    count++;
                    z--;
                }
            }

            if (count >= 2)
            {
            character_count++;
            } else
            {

            }
            i--;//во я дэбил
        }
        return character_count;
    }

}
