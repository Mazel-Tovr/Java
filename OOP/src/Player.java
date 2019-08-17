import java.util.*;

public class Player extends Person
{

    private Roles role;
    private String team;
    private List<Double> mapplayed = new ArrayList<>();
    private int kills=0;
    private int deaths=0;
    public void Playerkill(){this.kills++;}
    public void Playerkilled(){this.deaths++;}
    //private ArrayList<>

    Player(String name,Roles role,Integer age,String team)
    {
        super(name,age);
        this.role = role;
        this.team = team;
    }

    public Roles getRole(){return role;}
    public String getTeam(){return team;}
    public Integer getMapplayed(){return mapplayed.size();}
    public Double getKdration()
        {
            Double sum = 0.0;
            if (mapplayed == null) return 0.0;
            for (var item:mapplayed)
            {
                sum += item.doubleValue();
            }
            return sum/mapplayed.size();
        }
    public void refreshKdrationg()
    {
        mapplayed.add((double)kills/deaths);
        kills = 0;deaths = 0;
    }



    public void InfotoDesplay()
    {
        System.out.println("Player " + getName() + " in age " + getAge() +" playing as" + getRole() +"with statistic "+getKdration()+" for a team " +getTeam() + " he played " + getMapplayed());
    }




}
