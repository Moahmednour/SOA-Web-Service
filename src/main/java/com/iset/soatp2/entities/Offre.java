package com.iset.soatp2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Offre {
    @Id@GeneratedValue
    long code;
    String intitulé;
    String specialité;
    String société;
    int nbpostes;
    String pays;
     
    public Offre() {
        super();
    }

    public Offre(long code, String intitulé, String specialité, String société, int nbpostes, String pays) {
        super();
        this.code = code;
        this.intitulé = intitulé;
        this.specialité = specialité;
        this.société = société;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }

    public long getCode() {
        return code;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public String getSpecialité() {
        return specialité;
    }

    public String getSociété() {
        return société;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public String getPays() {
        return pays;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }

    public void setSociété(String société) {
        this.société = société;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}