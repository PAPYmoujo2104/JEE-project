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
        playerList.add(new Player("Daehan","Ki","22","Expect","Korean","Excel Esports"));
        playerList.add(new Player("Marc","Lamont","23","Caedrel","UK","Excel Esports"));
        playerList.add(new Player("Youngmin","Son","22","Mickey","Korean","Excel Esports"));
        playerList.add(new Player("Patrik","Jiru","19","Patrik","Czech Republic","Excel Esports"));
        playerList.add(new Player("Tore","Eilertsen","20","Tore","Norway","Excel Esports"));
        playerList.add(new Player("Gabriel","Rau","21","Bwipo","Belgium","Fnatic"));
        playerList.add(new Player("Oskar","Boderek","20","Selfmade","Poland","Fnatic"));
        playerList.add(new Player("Tim","Lipovsek","20","Nemesis","Slovenia","Fnatic"));
        playerList.add(new Player("Martin","Larsson","23","Rekkles","Sweden","Fnatic"));
        playerList.add(new Player("Zdravets","Galabov","24","Hylissang","Bulgaria","Fnatic"));
        playerList.add(new Player("Lucas","Simon-Meslet","21","Cabochard","French","Team Vitality"));
        playerList.add(new Player("Duncan","Marquet","19","Skeanz","French","Team Vitality"));
        playerList.add(new Player("Lucas","Fayard","21","Saken","French","Team Vitality"));
        playerList.add(new Player("Markos","Stamkopoulos","18","Comp","Greece","Team Vitality"));
        playerList.add(new Player("Pierre","Medjaldi","23","Steeelback","French","Team Vitality"));
        playerList.add(new Player("Toni","Sabalic","23","Sacre","Croatia","SK Gaming"));
        playerList.add(new Player("Kim","Gang-yun","24","Trick","Korean","SK Gaming"));
        playerList.add(new Player("Janik","Bartels","21","Jenax","Germany","SK Gaming"));
        playerList.add(new Player("Jus","Marusic","21","Crownshot","Slovenia","SK Gaming"));
        playerList.add(new Player("Dino","Tot","22","Limit","Croatia","SK Gaming"));
    }
    
    public static List <Player> getInstance(){
        return playerList;
    }
}
