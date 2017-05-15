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
public class MatchstatPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "matchid")
    private String matchid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "playerid")
    private String playerid;

    public MatchstatPK() {
    }

    public MatchstatPK(String matchid, String playerid) {
        this.matchid = matchid;
        this.playerid = playerid;
    }

    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getPlayerid() {
        return playerid;
    }

    public void setPlayerid(String playerid) {
        this.playerid = playerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchid != null ? matchid.hashCode() : 0);
        hash += (playerid != null ? playerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MatchstatPK)) {
            return false;
        }
        MatchstatPK other = (MatchstatPK) object;
        if ((this.matchid == null && other.matchid != null) || (this.matchid != null && !this.matchid.equals(other.matchid))) {
            return false;
        }
        if ((this.playerid == null && other.playerid != null) || (this.playerid != null && !this.playerid.equals(other.playerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.MatchstatPK[ matchid=" + matchid + ", playerid=" + playerid + " ]";
    }
    
}
