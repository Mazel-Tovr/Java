import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tournament
{
    protected String name;
    protected String tournamenttype;
    protected HashMap<Integer,Team> Place = new HashMap<>();
    protected HashMap<Integer,Team> Grid;
    public abstract void GenerateTournamentGrid(ArrayList<Team> teams);
    public abstract void StartTournament();

    Tournament(String name,String tournamenttype){this.name = name;this.tournamenttype = tournamenttype;}

    public String getTournamentInfo() {return name+ " " + tournamenttype;}
    public HashMap<Integer,Team> getPlace(){return Place;}
    public HashMap<Integer, Team> getGrid() { return Grid; }
    public void setGrid(HashMap<Integer, Team> grid) { Grid = grid; }
}
