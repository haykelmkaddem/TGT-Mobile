/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.models;

import com.esprit.pidev.enumeration.StatutEnt;

import java.util.Objects;

/**
 *
 * @author goldzeo
 */
public class Entretien {
    private int id;
    private String dateEnt;
    private StatutEnt statutEnt;
    private float noteEnt;
    private Candidat candidat;

    public Entretien(int id) {
        this.id = id;
    }
    
   
    public Entretien( String dateEnt, StatutEnt statutEnt, float noteEnt, Candidat candidat ) {
        this.dateEnt = dateEnt;
        this.statutEnt = statutEnt;
        this.noteEnt = noteEnt;
        this.candidat = candidat;
    }

    public Entretien(int id, String dateEnt, StatutEnt statutEnt, float noteEnt, Candidat candidat) {
        this.id = id;
        this.dateEnt = dateEnt;
        this.statutEnt = statutEnt;
        this.noteEnt = noteEnt;
        this.candidat = candidat;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(String dateEnt) {
        this.dateEnt = dateEnt;
    }

    public StatutEnt getStatutEnt() {
        return statutEnt;
    }

    public void setStatutEnt(StatutEnt statutEnt) {
        this.statutEnt = statutEnt;
    }

    public float getNoteEnt() {
        return noteEnt;
    }

    public void setNoteEnt(float noteEnt) {
        this.noteEnt = noteEnt;
    }

  
    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    @Override
    public String toString() {
        return "Entretien{" + "id=" + id + ", dateEnt=" + dateEnt + ", statutEnt=" + statutEnt + ", noteEnt=" + noteEnt + ", candidat=" + candidat + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.dateEnt);
        hash = 89 * hash + Objects.hashCode(this.statutEnt);
        hash = 89 * hash + Float.floatToIntBits(this.noteEnt);
        hash = 89 * hash + Objects.hashCode(this.candidat);
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
        final Entretien other = (Entretien) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.noteEnt) != Float.floatToIntBits(other.noteEnt)) {
            return false;
        }
        if (!Objects.equals(this.dateEnt, other.dateEnt)) {
            return false;
        }
        if (this.statutEnt != other.statutEnt) {
            return false;
        }
        if (!Objects.equals(this.candidat, other.candidat)) {
            return false;
        }
        return true;
    }

   

   
    

    
    
}
