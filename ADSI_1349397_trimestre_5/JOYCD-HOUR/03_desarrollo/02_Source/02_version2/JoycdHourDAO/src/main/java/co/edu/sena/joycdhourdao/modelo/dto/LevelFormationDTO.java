/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.joycd.modelo.DTO;

import java.util.Objects;

/**
 *
 * @author 1349397
 */
public class LevelFormationDTO implements java.io.Serializable{
    private static long serialVersionUID = 10L;
    private String levelFormation;
    private boolean status;

    public LevelFormationDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        LevelFormationDTO.serialVersionUID = serialVersionUID;
    }

    public String getLevelFormation() {
        return levelFormation;
    }

    public void setLevelFormation(String levelFormation) {
        this.levelFormation = levelFormation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.levelFormation);
        return hash;
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
        final LevelFormationDTO other = (LevelFormationDTO) obj;
        if (!Objects.equals(this.levelFormation, other.levelFormation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LevelFormationDTO{" + "levelFormation=" + levelFormation + ", status=" + status + '}';
    }

    
}
