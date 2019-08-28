import java.util.ArrayList;

public class TimeFormatter
{
    public static String formatDuration(int seconds)
    {
        if(seconds == 0) return "now";
        final int sec = 1;
        final int minutes = 60;
        final int hours = 3600;
        final int days = 86400;
        final int years = 31536000;

        int seccount = 0;
        int minutescount = 0;
        int hourscount = 0;
        int dayscount = 0;
        int yearscount = 0;

            while (seconds>= years)
            {
                seconds -=years;
                yearscount++;
            }
            while (seconds>= days)
            {
                seconds -=days;
                dayscount++;
            }
            while (seconds>= hours)
            {
                seconds -=hours;
                hourscount++;
            }
            while (seconds>= minutes)
            {
                seconds -=minutes;
                minutescount++;
            }
            while (seconds>= sec)
            {
                seconds -=sec;
                seccount++;
            }
            ArrayList<String> Answer = new ArrayList<>();
            if(yearscount > 0) Answer.add(yearscount>1 ? yearscount+ " years" : yearscount+" year");
            if(dayscount>0) Answer.add(dayscount>1 ? dayscount+ " days" : dayscount+" day");
            if(hourscount>0) Answer.add(hourscount>1 ? hourscount+ " hours" : hourscount+" hour");
            if(minutescount>0) Answer.add(minutescount>1 ? minutescount+ " minutes" : minutescount+" minute");
            if(seccount>0) Answer.add(seccount>1 ? seccount+ " seconds" : seccount+" second");

       return Answer.size() == 1 ? Answer.get(0) : Answer.size() == 2 ? Answer.get(0)+" and "+Answer.get(1) : Answer.size() == 3 ? Answer.get(0) +", "+Answer.get(1)+" and "+Answer.get(2): Answer.size() == 4 ? Answer.get(0) + ", " +Answer.get(1) + ", " +Answer.get(2) + " and "+Answer.get(3) : Answer.get(0) + ", " + Answer.get(1) + ", " + Answer.get(2) + ", "+Answer.get(3)+" and "+Answer.get(4);
    }

}
