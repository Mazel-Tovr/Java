import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game
{
    private Team team1;
    private Team team2;

    Game(Team team1, Team team2)
    {
        this.team1 = team1;
        this.team2 = team2;
    }


    //Какое то подобие игры
    public void PlayGame()
    {
        int team1winround = 0;
        int team2winround = 0;
        int roundcount = 1;
        boolean someonewingame =false;
        while (someonewingame == false)
        {
          // ArrayList<Integer> IndexOfPlayers1 = new ArrayList<>();
           // ArrayList<Integer> IndexOfPlayers2 = new ArrayList<>();

            System.out.println("Round "+ roundcount + " Start");
            System.out.println("People alive " +(team1.Count() + team2.Count()));
            ArrayList<Player> AliveTeam1 = new ArrayList<>();
            ArrayList<Player> AliveTeam2 = new ArrayList<>();
            for(int i = 0;i<5;i++)
            {
                AliveTeam1.add(team1.GetPlayer(i));
                AliveTeam2.add(team2.GetPlayer(i));
            }


            while ( AliveTeam1.size() > 0 || AliveTeam2.size() > 0)
            {

                Random rnd = new Random();
               var one = rnd.nextInt(AliveTeam1.size());
               var two = rnd.nextInt(AliveTeam2.size());

                if( rnd.nextInt(2) == 0)
               {
                   System.out.println("Player "+ AliveTeam1.get(one).getName() + " kills Player "+ AliveTeam2.get(two).getName());
                   AliveTeam1.get(one).Playerkill();
                   AliveTeam2.get(two).Playerkilled();
                   AliveTeam2.remove(two);


               }
                else
                {
                    System.out.println("Player "+ AliveTeam2.get(two).getName() + " kills Player "+AliveTeam1.get(one).getName());
                    AliveTeam2.get(two).Playerkill();
                    AliveTeam1.get(one).Playerkilled();
                    AliveTeam1.remove(one);


                }
                System.out.println();
                System.out.println("Players alive " + (AliveTeam1.size() + AliveTeam2.size()));
                if(AliveTeam1.size() == 0){ team2winround++; break;}
                if(AliveTeam2.size() == 0){ team1winround++; break;}

            }

            if(team1winround == 16 || team1winround == 16)
            {
                someonewingame =true;
                if(team1winround == 16) team1.GameResult(true);else team1.GameResult(false);
                if(team2winround == 16) team2.GameResult(true);else team2.GameResult(false);

                for (int i = 0;i < 5;i++)
                {
                  team1.GetPlayer(i).refreshKdrationg();
                  team2.GetPlayer(i).refreshKdrationg();
                }
            }
            roundcount++;
        }

        //Some kod

    }




}
