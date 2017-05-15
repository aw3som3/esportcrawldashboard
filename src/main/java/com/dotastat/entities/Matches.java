/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sinichiKuda
 */
@Entity
@Table(name = "matches")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matches.findAll", query = "SELECT m FROM Matches m")})
public class Matches implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "id")
    private String id;
    @Size(max = 64)
    @Column(name = "tournamentid")
    private String tournamentid;
    @Size(max = 255)
    @Column(name = "tournamenttext")
    private String tournamenttext;
    @Size(max = 64)
    @Column(name = "teamid1")
    private String teamid1;
    @Size(max = 64)
    @Column(name = "teamid2")
    private String teamid2;
    @Size(max = 64)
    @Column(name = "winner")
    private String winner;
    @Column(name = "dtMatch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtMatch;

    public Matches() {
    }

    public Matches(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTournamentid() {
        return tournamentid;
    }

    public void setTournamentid(String tournamentid) {
        this.tournamentid = tournamentid;
    }

    public String getTournamenttext() {
        return tournamenttext;
    }

    public void setTournamenttext(String tournamenttext) {
        this.tournamenttext = tournamenttext;
    }

    public String getTeamid1() {
        return teamid1;
    }

    public void setTeamid1(String teamid1) {
        this.teamid1 = teamid1;
    }

    public String getTeamid2() {
        return teamid2;
    }

    public void setTeamid2(String teamid2) {
        this.teamid2 = teamid2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Date getDtMatch() {
        return dtMatch;
    }

    public void setDtMatch(Date dtMatch) {
        this.dtMatch = dtMatch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matches)) {
            return false;
        }
        Matches other = (Matches) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.Matches[ id=" + id + " ]";
    }
    
}
