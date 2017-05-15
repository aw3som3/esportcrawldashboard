package com.dotastat.services.impl;

import com.dotastat.entities.ActiveTeams;
import com.dotastat.entities.Teams;
import com.dotastat.repos.TeamsRepo;
import com.dotastat.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamsRepo teamsRepo;

    @Override
    public List<Teams> listAllByPage() {
        return teamsRepo.findAll();
    }

    @Override
    public List<ActiveTeams> activeTeams(){
        List<Object[]> activeteams  = teamsRepo.getActiveTeams();
        List<ActiveTeams> at = new ArrayList<>();
        for(int i=0;i<activeteams.size();i++){
            ActiveTeams a = new ActiveTeams();
            a.setTeamid((String)activeteams.get(i)[0]);
            a.setTeamname((String)activeteams.get(i)[1]);
            a.setCount1(((BigInteger) activeteams.get(i)[2]).intValue());
            at.add(a);
        }
        return at;
    }
}
