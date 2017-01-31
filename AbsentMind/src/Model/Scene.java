/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Josh
 */
public class Scene implements Serializable{
    
    private String description;
    private double travelTime;
    private String updateDescription;
    private String nonPlayableCharacter;
    private String clueLocation;
    private String interactions;
    private String displaySymbol;

    public Scene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getNonPlayableCharacter() {
        return nonPlayableCharacter;
    }

    public void setNonPlayableCharacter(String nonPlayableCharacter) {
        this.nonPlayableCharacter = nonPlayableCharacter;
    }

    public String getClueLocation() {
        return clueLocation;
    }

    public void setClueLocation(String clueLocation) {
        this.clueLocation = clueLocation;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.updateDescription);
        hash = 73 * hash + Objects.hashCode(this.nonPlayableCharacter);
        hash = 73 * hash + Objects.hashCode(this.clueLocation);
        hash = 73 * hash + Objects.hashCode(this.interactions);
        hash = 73 * hash + Objects.hashCode(this.displaySymbol);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", updateDescription=" + updateDescription + ", nonPlayableCharacter=" + nonPlayableCharacter + ", clueLocation=" + clueLocation + ", interactions=" + interactions + ", displaySymbol=" + displaySymbol + '}';
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.updateDescription, other.updateDescription)) {
            return false;
        }
        if (!Objects.equals(this.nonPlayableCharacter, other.nonPlayableCharacter)) {
            return false;
        }
        if (!Objects.equals(this.clueLocation, other.clueLocation)) {
            return false;
        }
        if (!Objects.equals(this.interactions, other.interactions)) {
            return false;
        }
        return Objects.equals(this.displaySymbol, other.displaySymbol);
    }
    
    
    
    
          
    
}
