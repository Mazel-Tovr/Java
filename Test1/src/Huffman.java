import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Node {
    private Character Symbol; //символ
    private Integer Frequency; //частота
    private Node Right; // правая ветка
    private Node Left;// левая ветка

    //А в Шарпе тупа get set написать (пизда ,хай)

    public Character GetSymbol() {
        return this.Symbol;
    }

    public void SetSymbol(Character Symbol) {
        this.Symbol = Symbol;
    }

    public Integer GetFrequency() {
        return this.Frequency;
    }

    public void SetFrequency(Integer Frequency) {
        this.Frequency = Frequency;
    }

    public Node GetRight() {
        return this.Right;
    }

    public void SetRight(Node Right) {
        this.Right = Right;
    }

    public Node GetLeft() {
        return this.Left;
    }

    public void SetLeft(Node Left) {
        this.Left = Left;
    }


    //Нумерация
    public ArrayList<Boolean> Traverse(Character symbol, ArrayList<Boolean> data)
    {

        if(Right == null && Left == null)
        {
            if(symbol.equals(Symbol))
            {
                return data;
            }
            else
            {
                return null;
            }
        }
        else
        {
            ArrayList<Boolean> left = null;
            ArrayList<Boolean> right = null;

            if(Left != null)
            {
                ArrayList<Boolean> leftPath = new ArrayList<Boolean>();
                leftPath.addAll(data);//аналог AddRange на шарпе
                leftPath.add(false);
                left = Left.Traverse(symbol, leftPath);
            }
            if(Right != null)
            {
                ArrayList<Boolean> rightPath = new ArrayList<Boolean>();
                rightPath.addAll(data);
                rightPath.add(true);
                right = Right.Traverse(symbol,rightPath);
            }
            if(left != null)
            {
                return left;
            }
            else
            {
                return right;
            }

        }

    }



}



public class Huffman
{
    private ArrayList<Node> nodes = new ArrayList<Node>();
    public Node Root; //корневой элемент
    public Map<Character,Integer> Frequencies = new HashMap<Character,Integer>();//словарь "Символ - частота"

    public void Build(String source1) //строим дерево
    {
        var source = source1.toCharArray();
        for (int i = 0;i < source.length;i++)
        {
            if(!Frequencies.containsKey(source[i]))
            {
                Frequencies.put(source[i], 0);
            }

            Frequencies.replace(source[i],Frequencies.get(source[i])+1);//Получаем старое значение и добавляем +1
        }

        for (HashMap.Entry<Character,Integer> symbol : Frequencies.entrySet() )
        {
            var a = new Node();
            a.SetSymbol(symbol.getKey());
            a.SetFrequency(symbol.getValue());
            nodes.add(a);
        }
        while (nodes.size() > 1)
        {
            ArrayList<Node> orderedNodes =  Collections.sort(nodes,(a,b) -> Integer.compare(a.GetFrequency(),b.GetFrequency()));


        }

    }


}