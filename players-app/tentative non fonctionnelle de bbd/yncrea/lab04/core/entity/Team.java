package yncrea.lab04.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Team extends GenericEntity {

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Player> player;

    @ManyToOne
    private Match match;

    @ManyToOne
    private Region region;


    public Team() {
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public List<Match> getMatch() {
        return Match;
    }


    public void setMatch(final List<Match> matchValue) {
        match = matchValue;
    }

    public List<Player> getPlayer() {
        return Player;
    }


    public void setPlayer(final List<Player> playerValue) {
        player = playerValue;
    }


    public Region getRegion() {
        return region;
    }


    public void setregion(final Region regionValue) {
        region = regionValue;
    }
}
