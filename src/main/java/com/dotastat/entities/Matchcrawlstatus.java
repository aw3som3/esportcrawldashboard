/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sinichiKuda
 */
@Entity
@Table(name = "matchcrawlstatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matchcrawlstatus.findAll", query = "SELECT m FROM Matchcrawlstatus m")})
public class Matchcrawlstatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "matchid")
    private String matchid;
    @Size(max = 255)
    @Column(name = "matchcrawled")
    private String matchcrawled;
    @Size(max = 255)
    @Column(name = "test")
    private String test;

    public Matchcrawlstatus() {
    }

    public Matchcrawlstatus(String matchid) {
        this.matchid = matchid;
    }

    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getMatchcrawled() {
        return matchcrawled;
    }

    public void setMatchcrawled(String matchcrawled) {
        this.matchcrawled = matchcrawled;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchid != null ? matchid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchcrawlstatus)) {
            return false;
        }
        Matchcrawlstatus other = (Matchcrawlstatus) object;
        if ((this.matchid == null && other.matchid != null) || (this.matchid != null && !this.matchid.equals(other.matchid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.Matchcrawlstatus[ matchid=" + matchid + " ]";
    }
    
}
