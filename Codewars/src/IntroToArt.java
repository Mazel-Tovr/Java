import java.util.*;

public class IntroToArt {
    public static void main(String[] args) {
        for (var line : getW(5)) {
            System.out.println(line);
        }
    }

    public static String[] getW(int height) {
        if(height < 2)
            return null;

        ArrayList<String> W = new ArrayList<>();

        int spacecount = height;
        int innerspacecount = 0;
        while (spacecount > 0) {
            StringBuilder sbline = new StringBuilder();
            if (innerspacecount == 0) {
                sbline.append(" ".repeat(spacecount));
                sbline.append("*");
                sbline.append(" ".repeat(spacecount));

                sbline.append(" ".repeat(spacecount));
                sbline.append("*");
                sbline.append(" ".repeat(spacecount));

                spacecount--;
                innerspacecount++;
            } else {
                sbline.append(" ".repeat(spacecount));
                sbline.append("*");
                sbline.append(" ".repeat(innerspacecount));
                sbline.append("*");
                sbline.append(" ".repeat(spacecount));

                sbline.append(" ".repeat(spacecount));
                sbline.append("*");
                sbline.append(" ".repeat(innerspacecount));
                sbline.append("*");
                sbline.append(" ".repeat(spacecount));
                spacecount--;
                innerspacecount+=2;

            }

            W.add(sbline.toString());
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
