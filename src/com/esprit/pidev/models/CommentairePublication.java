/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.models;

import java.util.Date;

/**
 *
 * @author Malek
 */
public class CommentairePublication {
    
    private int id_comment;
    private String contenu;
    private int nbinutile;
    private int ratingComm;
    private Date dateComm;
    private Publication p;
    
    //Update Query
    public CommentairePublication(int id_comment, String contenu,int nbinutile, int ratingComm , Date dateComm) {
        this.id_comment = id_comment;
        this.contenu = contenu;
        this.ratingComm = ratingComm;
        this.nbinutile = nbinutile;
        this.dateComm = dateComm;
    }
    
    
    //Delete Query
    public CommentairePublication(int id_comment) {
        this.id_comment = id_comment;
    }
    
    public int getId_comment() {
        return id_comment;
    }

    public void setId_comment(int id_comment) {
        this.id_comment = id_comment;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNbinutile() {
        return nbinutile;
    }

    public void setNbinutile(int nbinutile) {
        this.nbinutile = nbinutile;
    }

    public int getRatingComm() {
        return ratingComm;
    }

    public void setRatingComm(int ratingComm) {
        this.ratingComm = ratingComm;
    }

    public Date getDateComm() {
        return dateComm;
    }

    public Publication getP() {
        return p;
    }

    @Override
    public String toString() {
        return "CommentairePublication{" + "id_comment=" + id_comment + ", contenu=" + contenu + ", nbinutile=" + nbinutile + ", ratingComm=" + ratingComm + ", dateComm=" + dateComm + '}';
    }
    
}
