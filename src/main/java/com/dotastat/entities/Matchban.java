/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sinichiKuda
 */
@Entity
@Table(name = "matchban")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matchban.findAll", query = "SELECT m FROM Matchban m")})
public class Matchban implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MatchbanPK matchbanPK;
    @Size(max = 64)
    @Column(name = "teamid")
    private String teamid;
    @Size(max = 64)
    @Column(name = "vs_teamid")
    private String vsTeamid;

    public Matchban() {
    }

    public Matchban(MatchbanPK matchbanPK) {
        this.matchbanPK = matchbanPK;
    }

    public Matchban(String matchid, String heroban) {
        this.matchbanPK = new MatchbanPK(matchid, heroban);
    }

    public MatchbanPK getMatchbanPK() {
        return matchbanPK;
    }

    public void setMatchbanPK(MatchbanPK matchbanPK) {
        this.matchbanPK = matchbanPK;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getVsTeamid() {
        return vsTeamid;
    }

    public void setVsTeamid(String vsTeamid) {
        this.vsTeamid = vsTeamid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchbanPK != null ? matchbanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchban)) {
            return false;
        }
        Matchban other = (Matchban) object;
        if ((this.matchbanPK == null && other.matchbanPK != null) || (this.matchbanPK != null && !this.matchbanPK.equals(other.matchbanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.Matchban[ matchbanPK=" + matchbanPK + " ]";
    }
    
}
