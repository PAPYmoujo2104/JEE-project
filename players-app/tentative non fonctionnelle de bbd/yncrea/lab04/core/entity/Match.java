package yncrea.lab04.core.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Match extends GenericEntity {


    private String name;




    public Match() {
    }







    public List<Team> getTeam() {
        return Team;
    }


    public void setTeam(final List<Team> TeamValue) {
        Team = TeamValue;
    }
}
