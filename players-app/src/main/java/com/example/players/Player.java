package com.example.players;

import java.util.concurrent.atomic.AtomicLong;

public class Player {

    private long id;
    private String name;
    private String lastName;
    private String age;
    private String pseudo;
    private String nationality;
    private String team;
    private static final AtomicLong counter = new AtomicLong(0);

    public Player(String name, String lastName, String age, String pseudo, String nationality, String team, long id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pseudo = pseudo;
        this.nationality = nationality;
        this.team = team;
        this.id = id;
    }
    
    public Player(String name, String lastName, String age, String pseudo, String nationality, String team) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pseudo = pseudo;
        this.nationality = nationality;
        this.team = team;
        this.id = counter.incrementAndGet();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name +
                ", lastName=" + lastName + ", age=" + age +
                ", pseudo=" + pseudo + ", nationality=" + nationality +
                ", team=" + team + '}';
    }

    
}
