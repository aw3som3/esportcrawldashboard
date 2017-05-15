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
@Table(name = "matchstat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matchstat.findAll", query = "SELECT m FROM Matchstat m")})
public class Matchstat implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MatchstatPK matchstatPK;
    @Size(max = 64)
    @Column(name = "teamid")
    private String teamid;
    @Size(max = 64)
    @Column(name = "kill")
    private String kill;
    @Size(max = 64)
    @Column(name = "death")
    private String death;
    @Size(max = 64)
    @Column(name = "assist")
    private String assist;
    @Size(max = 64)
    @Column(name = "gpm")
    private String gpm;
    @Size(max = 64)
    @Column(name = "xpm")
    private String xpm;
    @Size(max = 255)
    @Column(name = "hero")
    private String hero;
    @Size(max = 255)
    @Column(name = "role")
    private String role;
    @Size(max = 255)
    @Column(name = "lane")
    private String lane;
    @Size(max = 255)
    @Column(name = "net")
    private String net;
    @Size(max = 255)
    @Column(name = "lh")
    private String lh;
    @Size(max = 255)
    @Column(name = "dn")
    private String dn;
    @Size(max = 255)
    @Column(name = "dmg")
    private String dmg;
    @Size(max = 255)
    @Column(name = "heal")
    private String heal;
    @Size(max = 255)
    @Column(name = "dmg_building")
    private String dmgBuilding;
    @Size(max = 255)
    @Column(name = "ward")
    private String ward;
    @Size(max = 255)
    @Column(name = "sentry")
    private String sentry;
    @Size(max = 255)
    @Column(name = "items")
    private String items;

    public Matchstat() {
    }

    public Matchstat(MatchstatPK matchstatPK) {
        this.matchstatPK = matchstatPK;
    }

    public Matchstat(String matchid, String playerid) {
        this.matchstatPK = new MatchstatPK(matchid, playerid);
    }

    public MatchstatPK getMatchstatPK() {
        return matchstatPK;
    }

    public void setMatchstatPK(MatchstatPK matchstatPK) {
        this.matchstatPK = matchstatPK;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getKill() {
        return kill;
    }

    public void setKill(String kill) {
        this.kill = kill;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getAssist() {
        return assist;
    }

    public void setAssist(String assist) {
        this.assist = assist;
    }

    public String getGpm() {
        return gpm;
    }

    public void setGpm(String gpm) {
        this.gpm = gpm;
    }

    public String getXpm() {
        return xpm;
    }

    public void setXpm(String xpm) {
        this.xpm = xpm;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getLh() {
        return lh;
    }

    public void setLh(String lh) {
        this.lh = lh;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getDmg() {
        return dmg;
    }

    public void setDmg(String dmg) {
        this.dmg = dmg;
    }

    public String getHeal() {
        return heal;
    }

    public void setHeal(String heal) {
        this.heal = heal;
    }

    public String getDmgBuilding() {
        return dmgBuilding;
    }

    public void setDmgBuilding(String dmgBuilding) {
        this.dmgBuilding = dmgBuilding;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getSentry() {
        return sentry;
    }

    public void setSentry(String sentry) {
        this.sentry = sentry;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matchstatPK != null ? matchstatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Matchstat)) {
            return false;
        }
        Matchstat other = (Matchstat) object;
        if ((this.matchstatPK == null && other.matchstatPK != null) || (this.matchstatPK != null && !this.matchstatPK.equals(other.matchstatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dotastat.entities.Matchstat[ matchstatPK=" + matchstatPK + " ]";
    }
    
}
