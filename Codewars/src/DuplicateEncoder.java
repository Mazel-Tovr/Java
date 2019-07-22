import java.util.*;

public class DuplicateEncoder
{
    /*
     The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string,
     or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

    Examples
    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
    Notes
    Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
     */
    static String encode(String word) {

        ArrayList<Character> arrayList1 = new ArrayList<>() {};
        for (int i = 0; i < word.length(); i++)
        {
            arrayList1.add(word.charAt(i));
        }
        word = "";
        for (int i = 0; i < arrayList1.size(); i++) {
            int count = 0;
            var temp = arrayList1.get(i);
            for (int z = 0; z < arrayList1.size(); z++) {
                if (temp == arrayList1.get(z) || temp == Character.toUpperCase(arrayList1.get(z))||Character.toUpperCase(temp) == arrayList1.get(z)) {
                    count++;
                }
            }

            if (count >= 2) {
                word += ")";
            } else {
                word += "(";
            }

        }
        return word;
    }
}
