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
 * @author David
 */
public class KeyItem implements Serializable{
    
    private String keyItemType;
    private String description;

    public KeyItem() {
    }

    public String getKeyItemType() {
        return keyItemType;
    }

    public void setKeyItemType(String keyItemType) {
        this.keyItemType = keyItemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.keyItemType);
        hash = 59 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "KeyItem{" + "keyItemType=" + keyItemType + ", description=" + description + '}';
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
        final KeyItem other = (KeyItem) obj;
        if (!Objects.equals(this.keyItemType, other.keyItemType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }    
    
}
