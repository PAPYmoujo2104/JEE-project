package com.example.players;

import java.util.List;
import java.util.Random;

public class Match {

    private Team team1;
    private Team team2;
    private String scoreEstimation;


    public Match(Team team1, Team team2) {

        this.team1=team1;
        this.team2=team2;

        int score_team1 = 0;
        int score_team2 = 0;
        while(score_team1<3 && score_team2<3){
            int win = new Random().nextInt(2);
            if (win==0) score_team1++;
            else score_team2++;
        }
        scoreEstimation = Integer.toString(score_team1) + " - "+ Integer.toString(score_team2);
    }


    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getScoreEstimation() {
        return scoreEstimation;
    }

    public void setScoreEstimation(String scoreEstimation) {
        this.scoreEstimation = scoreEstimation;
    }
}