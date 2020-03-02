package yncrea.lab04.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Region extends GenericEntity {

    private String name;

    @OneToMany
    private Team team;


    public Region() {
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public Team getTeam() {
        return team;
    }


    public void setTeam(final Team teamValue) {
        team = teamValue;
    }
}
