/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author sinichiKuda
 */
@Embeddable
public class MatchbanPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "matchid")
    private String matchid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "heroban")
    private String heroban;

    public MatchbanPK() {
    }

    public MatchbanPK(String matchid, String heroban) {
        this.matchid = matchid;
        this.heroban = heroban;
    }

    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getHeroban() {
        return heroban;
    }

    public void setHeroban(String heroban) {
        this.heroban = heroban;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchid != null ? matchid.hashCode() : 0);
        hash += (heroban != null ? heroban.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MatchbanPK)) {
            return false;
        }
        MatchbanPK other = (MatchbanPK) object;
        if ((this.matchid == null && other.matchid != null) || (this.matchid != null && !this.matchid.equals(other.matchid))) {
            return false;
        }
        if ((this.heroban == null && other.heroban != null) || (this.heroban != null && !this.heroban.equals(other.heroban))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.MatchbanPK[ matchid=" + matchid + ", heroban=" + heroban + " ]";
    }
    
}
