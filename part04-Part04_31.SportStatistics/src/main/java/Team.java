/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Team {

    String name;
    int teamWins;
    int teamLosses;

    public Team(String name) {
        this.name = name;
        this.teamWins = 0;
        this.teamLosses = 0;

    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return teamWins;
    }

    public int getLosses() {
        return teamLosses;
    }

    public void addWins() {
        this.teamWins++;
    }

    public void addLoss() {
        this.teamLosses++;
    }

    public int getGames() {
        return teamWins + teamLosses;
    }
}
