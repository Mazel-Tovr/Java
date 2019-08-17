import java.util.ArrayList;
import java.util.List;

public class Main
{
 public  static  void main(String[] args)
 {
     List<Player> players = new ArrayList<>();
     Team NaVi = new Team("Natus Vincere");
     Coach coach = new Coach("Mikhaylo",30);
     players.add( new Player("Aleksandr",Roles.sniper,21, NaVi.getTeam_name()));
     players.add( new Player("Denis",Roles.attacker,20, NaVi.getTeam_name()));
     players.add( new Player("Egor",Roles.support,22, NaVi.getTeam_name()));
     players.add( new Player("Kirill",Roles.attacker,20, NaVi.getTeam_name()));
     players.add( new Player("Danylo",Roles.capitan,31, NaVi.getTeam_name()));

     for (var item : players)
     {
         NaVi.AddPlayers(item);
     }
     NaVi.AddCoach(coach);
     NaVi.TeamInfo();
     List<Player> players2 = new ArrayList<>();
     Team NaViJunior = new Team("NaViJunior");
     players2.add( new Player("Aleksandrrr",Roles.sniper,21, NaViJunior.getTeam_name()));
     players2.add( new Player("Denisss",Roles.attacker,20, NaViJunior.getTeam_name()));
     players2.add( new Player("Egorrr",Roles.support,22, NaViJunior.getTeam_name()));
     players2.add( new Player("Kirillll",Roles.attacker,20, NaViJunior.getTeam_name()));
     players2.add( new Player("Danylooo",Roles.capitan,31, NaViJunior.getTeam_name()));

     for (var item : players2)
     {
         NaViJunior.AddPlayers(item);
     }
   Game g1 = new Game(NaVi,NaViJunior);
     g1.PlayGame();

     NaVi.TeamInfo();
     g1.PlayGame();
     NaVi.TeamInfo();
 }
}
