package com.dotastat.rest;

import com.dotastat.entities.ActiveTeams;
import com.dotastat.entities.Matches;
import com.dotastat.entities.Teams;
import com.dotastat.services.MatchesService;
import com.dotastat.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@RestController
public class TeamsRest {
    @Autowired
    private TeamService teamService;
    @RequestMapping(value="/teams",method= RequestMethod.GET)
    List<Teams> list(){
        List<Teams> teams = teamService.listAllByPage();
        return teams;
    }
    @RequestMapping(value="/activeteams",method= RequestMethod.GET)
    List<ActiveTeams> activeteams(){
        List<ActiveTeams> teams = teamService.activeTeams();
        return teams;
    }
}
