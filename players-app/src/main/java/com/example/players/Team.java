package com.example.players;


import java.util.List;

public class Team {

    private long id;
    private String name;
    private List<Player> team;
    private String region;
    private String creationDate;
    private String coachName;

    public Team(String name, List<Player> team, String region, String creationDate, String coachName) {
        this.name = name;
        this.region = region;
        this.creationDate = creationDate;
        this.coachName = coachName;
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String setCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public List<Player> getTeam() {
        return team;
    }

    public void setTeam(List<Player> team) {
        this.team = team;
    }



}
