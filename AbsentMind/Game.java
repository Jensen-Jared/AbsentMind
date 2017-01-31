/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absentmind;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author David
 */
public class Game implements Serializable{
    private String map;
    private String player;
    private double timeExpired;
    private double timeRemaining;

    public Game() {
    }

    
    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public double getTimeExpired() {
        return timeExpired;
    }

    public void setTimeExpired(double timeExpired) {
        this.timeExpired = timeExpired;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.map);
        hash = 89 * hash + Objects.hashCode(this.player);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.timeExpired) ^ (Double.doubleToLongBits(this.timeExpired) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "map=" + map + ", player=" + player + ", timeExpired=" + timeExpired + ", timeRemaining=" + timeRemaining + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timeExpired) != Double.doubleToLongBits(other.timeExpired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    
}

