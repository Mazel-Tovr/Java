import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tournament
{
    protected HashMap<Integer,Team> Place;
    public abstract void GenerateTournamentGrid(ArrayList<Team> teams);

    public abstract void StartTournament();


}
