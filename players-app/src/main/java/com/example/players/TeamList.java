package com.example.players;

import java.util.ArrayList;
import java.util.List;

public class TeamList {
    private static final List<Team> teamList = new ArrayList();

    private TeamList(){
    }

    static{
        teamList.add(new Team("G2", PlayerService.searchPlayers("G2"),"EUW","2015-10-15","GrabbZ "));
        teamList.add(new Team("Excel Esports", PlayerService.searchPlayers("Excel Esports"),"EUW","2015-12-17","YoungBuck"));
        teamList.add(new Team("Fnatic", PlayerService.searchPlayers("Fnatic"),"EUW","2011-03-14","Mithy"));
        teamList.add(new Team("Team Vitality", PlayerService.searchPlayers("Team Vitality"),"EUW","2015-12-09","Duke"));
        teamList.add(new Team("SK Gaming", PlayerService.searchPlayers("SK Gaming"),"EUW","Unlimited","2010-09-16"));

    }

    public static List <Team> getInstance(){
        return teamList;
    }
}
