import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Tournametfourteam extends Tournament
{
    Tournametfourteam(String name ,String tournamenttype)
 {
     super(name,tournamenttype);
 }

    @Override
    public void GenerateTournamentGrid(ArrayList<Team> teams)
    {

        if (teams.size() == 4 )
        {
            HashMap<Integer,Team> Grid = new HashMap<>();
            Random rnd =new Random();
            int i = 1;
            while (teams.size()>0)
            {
                int a = rnd.nextInt(teams.size());
                Grid.put(i,teams.get(a));
                teams.remove(a);
                i++;
            }
            setGrid(Grid);
        }
        else System.out.println("Неподходяшее количество команд для турнира");
    }

    @Override
    public void StartTournament()
    {
        try {
            HashMap<Integer,Team> FirstPlace= new HashMap<>();
            HashMap<Integer,Team> ThirdPlace= new HashMap<>();
            //First 2 games
            for(int i = 1, a = 1;i < 4;i+=2,a++)
            {
                Game game = new Game(Grid.get(i),getGrid().get(i+1));
                game.PlayGame();
                FirstPlace.put(a,game.getWiner());
                ThirdPlace.put(a,game.getLoser());
            }
            //Last 2 games
            Game ForFistPlace = new Game(FirstPlace.get(1),FirstPlace.get(2));
            ForFistPlace.PlayGame();
            Place.put(1,ForFistPlace.getWiner());
            Place.put(2,ForFistPlace.getLoser());

            Game ForThirdPlace = new Game(ThirdPlace.get(1),ThirdPlace.get(2));
            ForThirdPlace.PlayGame();
            Place.put(3,ForThirdPlace.getWiner());
            Place.put(4,ForThirdPlace.getLoser());
        } catch (Exception e)
        {

           System.out.println("Сгенерируйте турнирную сетку"); e.printStackTrace();
        }

    }
}
