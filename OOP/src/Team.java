import java.util.ArrayList;
import java.util.List;

public class Team
{
    private String team_name;
    private List<Player> Players = new ArrayList<>();
    private Coach coach;
    private Integer mapswin = 0;
    private Integer mapslose = 0;

    Team(String team_name)
    {
        this.team_name = team_name;

    }
    public String getTeam_name(){return  team_name;}

    public void AddPlayers(Player player)
    {
        this.Players.add(player);
    }

    public void AddCoach(Coach coach)
    {
        this.coach = coach;
    }

    public void DeleteCoach()
    {
        this.coach.ChangeDate("Team has no coach",null);
    }

    public void DeletePlayerInd(int index)
    {
        Players.remove(index);
    }

    public void DeletePLayerObj(Player player){Players.remove(player);}

    public void GameResult(boolean win) { if(win)mapswin++;else mapslose++;}

    public Player GetPlayer(int i){return  Players.get(i);}

    public Integer Count(){return Players.size();}

    public Double GetTeamWinRate(){return (double)(mapswin/(mapswin+mapslose))*100; }


    public void TeamInfo()
    {
        System.out.println("Team name " + getTeam_name());
        System.out.println("Team coach " + coach.getName());
         if(Players.size() == 0 ) System.out.println("Team has no player");
         else
             {
             for (var item : Players)
             {
                 System.out.println("Player " + item.getName() + " in age " + item.getAge() + " playing as " + item.getRole() + " with statistic " + item.getKdration() + " for a team «" +  item.getTeam()+"»"+ " he played " + item.getMapplayed() + " maps");
             }
         }
    }
}
