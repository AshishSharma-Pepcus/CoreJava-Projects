package Generics.Tornament.PremierLeague;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team> {
    private String name;

    public League(String name) {
        this.name = name;
    }

    ArrayList<T> league = new ArrayList<>();

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getTeamName() + " already exists");
            return false;
        }
        else {
            league.add(team);
            System.out.println(team.getTeamName() + " added to the PremierLeague!");
            return true;
        }
    }

    public void showTable() {
        Collections.sort(league);
        System.out.println("Team--Played--Won--Lost--Tied-Points");
        for (T t:league) {
            System.out.println(t.getTeamName() +"--"+ t.played +"--"+ t.won+"--"+t.lost+"--"+t.tied+"--"+t.points());
        }
    }

}
