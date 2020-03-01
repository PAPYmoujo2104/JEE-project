package yncrea.lab04.core.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Player extends GenericEntity{


    private String name;

    @ManyToOne(mappedBy = "player")
    private List<Team> Team;


    public Player() {
    }





    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public List<Team> getTeam() {
        return Team;
    }


    public void setTeam(final List<Team> TeamValue) {
        Team = TeamValue;
    }


}
