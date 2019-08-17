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

            int playersalive1 = 5;
            int playersalive2 = 5;
            while ( playersalive1 > 0 || playersalive2 > 0)
            {

                Random rnd = new Random();
               var one =rnd.nextInt(team1.Count());
               var two = rnd.nextInt(team2.Count());

                if( rnd.nextInt(2) == 0)
               {
                   System.out.println("Player "+ team1.GetPlayer(one).getName() + " kills Player "+team2.GetPlayer(two).getName());
                   team1.GetPlayer(one).Playerkill();
                   team2.GetPlayer(two).Playerkilled();
                  // team2.DeletePlayerInd(two);
                   playersalive1--;

               }
                else
                {
                    System.out.println("Player "+ team2.GetPlayer(one).getName() + " kills Player "+team1.GetPlayer(two).getName());
                    team2.GetPlayer(one).Playerkill();
                    team1.GetPlayer(two).Playerkilled();
                    //team1.DeletePlayerInd(two);
                    playersalive2--;

                }
                System.out.println();
                System.out.println("Players alive " + (playersalive1 + playersalive2));
                if(playersalive1 == 0){ team2winround++; break;}
                if(playersalive2 == 0){ team1winround++; break;}

            }

            if(team1winround == 16 || team1winround == 16)
            {
                someonewingame =true;
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
