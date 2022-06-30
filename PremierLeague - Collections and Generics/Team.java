package Generics.Tornament.PremierLeague;

import java.util.ArrayList;

public class Team<T extends Player > implements Comparable<Team<T>> {
    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    ArrayList<T> teamMembers = new ArrayList<>();

    public boolean addPlayer(T player) {
        if (teamMembers.contains(player)) {
            System.out.println(player.getName() + " already exists!");
            return false;
        }
        else {
            teamMembers.add(player);
            return true;
        }
    }

    public int numPlayers() {
        System.out.print("Members in the team: " );
        return teamMembers.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore>theirScore) {
            won++;
            message = "beat";
        }
        else if (ourScore==theirScore){
            tied++;
            message = "drew";
        }
        else {
            lost++;
            message = "lost to";
        }
        played++;
        if (opponent!=null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null,theirScore,ourScore);
        }

    }
    public int points() {
        return won*2 + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.points()>team.points()) {
            return -1;
        }else if (this.points()<team.points()) {
            return 1;
        }else {
            return 0;
        }
    }
}
