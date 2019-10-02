import java.util.*;

public class IntroToArt {
    public static void main(String[] args) {
        for (var line : getW(3)) {
            System.out.println(line);
        }
    }

    public static String[] getW(int height) {
        if(height < 2)
            return new String[0];
        ArrayList<String> W = new ArrayList<>();
        int spacecount = height-1;
        int innerspacecount = 0;
        while (spacecount >= 0)
        {
            String str="";
            if(innerspacecount == 0)
            {
                str = " ".repeat(spacecount) + "*"+ " ".repeat((spacecount*2)-1) + "*" + " ".repeat(spacecount);
                spacecount --;
                innerspacecount++;
            }
            else if(spacecount == 0)
            {
                str =  "*"+ " ".repeat(innerspacecount) + "*" + " ".repeat(innerspacecount)+"*";
                spacecount --;
            }
            else
            {
                str = " ".repeat(spacecount) + "*"+" ".repeat(innerspacecount)+ "*" +" ".repeat((spacecount*2)-1) + "*"+" ".repeat(innerspacecount)+ "*";
                spacecount --;
                innerspacecount+=2;
            }

            W.add(str);
        }
       Collections.reverse(W);


        return W.toArray(new String[0]);
    }
//    public static String[] getW(int height) {
//        if(height < 2)
//            return null;
//
////        String[] v1 = getV(height);
////        for (int i = 0; i < v1.length; i++) {
////            v1[i] += new StringBuilder(v1[i]).delete(0,2).toString();
////        }
////
////        return v1;
//
//    }

}
