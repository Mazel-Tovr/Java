public class Likes
{
    public static String whoLikesIt(String... names)
    {   String[] s = names;
        if(s.length == 0) return "no one likes this";
        if(s.length == 1) return s[0]+ " likes this";
        if(s.length == 2) return s[0]+" and "+s[1]+" like this";
        if(s.length == 3) return s[0]+", "+s[1]+" and "+s[2]+" like this";
        if(s.length >= 4) return s[0]+", "+s[1]+" and "+(s.length-2)+" others like this";
        return "";
    }
}
