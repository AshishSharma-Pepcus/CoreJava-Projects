package Generics.Tornament.PremierLeague;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballleague = new League<>("PremierLeague");

        Team<FootballPlayer> mun = new Team<>("MUN");
        Team<FootballPlayer> liv = new Team<>("LIV");
        Team<FootballPlayer> che = new Team<>("CHE");
        Team<FootballPlayer> ars = new Team<>("ARS");
        Team<FootballPlayer> city = new Team<>("MAC");

        footballleague.addTeam(mun);
        footballleague.addTeam(liv);
        footballleague.addTeam(che);
        footballleague.addTeam(ars);
        footballleague.addTeam(city);

        mun.matchResult(liv,3,2);
        mun.matchResult(che,1,2);
        mun.matchResult(city,2,4);
        mun.matchResult(ars,2,2);
        liv.matchResult(city,1,2);
        liv.matchResult(che,3,2);
        liv.matchResult(ars,3,2);
        ars.matchResult(city,5,1);
        ars.matchResult(che,3,2);
        che.matchResult(city,3,2);

        footballleague.showTable();
    }
}
