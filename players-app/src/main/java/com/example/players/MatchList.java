package com.example.players;

import java.util.ArrayList;
import java.util.List;


public class MatchList {
    private static final List<Match> matchList = new ArrayList();

    private MatchList(){
    }

    static{
        matchList.add(new Match(TeamList.getInstance().get(0) , TeamList.getInstance().get(1)));
        matchList.add(new Match(TeamList.getInstance().get(2) , TeamList.getInstance().get(3)));
        matchList.add(new Match(TeamList.getInstance().get(3) , TeamList.getInstance().get(4)));
        matchList.add(new Match(TeamList.getInstance().get(0) , TeamList.getInstance().get(4)));
        matchList.add(new Match(TeamList.getInstance().get(3) , TeamList.getInstance().get(0)));
        matchList.add(new Match(TeamList.getInstance().get(4) , TeamList.getInstance().get(2)));
    }

    public static List <Match> getInstance(){
        return matchList;
    }
}
