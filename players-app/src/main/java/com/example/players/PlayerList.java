package com.example.players;

import java.util.ArrayList;
import java.util.List;


public class PlayerList {
    private static final List<Player> playerList = new ArrayList();
    
    private PlayerList(){
    }
    
    static{
        playerList.add(new Player("Martin","Hansen","21","Wunder","Danish","G2"));
        playerList.add(new Player("Rasmus","Winther","20","Caps","Danish","G2"));
        playerList.add(new Player("Marcin","Jankowski","24","Jankos","Polish","G2"));
        playerList.add(new Player("Mihael","Mehle","21","Mikyx","Slovene","G2"));
        playerList.add(new Player("Luka","Perkovic","21","Perkz","Croatian","G2"));
    }
    
    public static List <Player> getInstance(){
        return playerList;
    }
}
