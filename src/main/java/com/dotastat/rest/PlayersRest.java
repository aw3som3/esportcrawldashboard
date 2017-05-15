package com.dotastat.rest;

import com.dotastat.entities.Players;
import com.dotastat.entities.Teams;
import com.dotastat.services.PlayersService;
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
public class PlayersRest {
    @Autowired
    private PlayersService playersService;
    @RequestMapping(value="/players",method= RequestMethod.GET)
    Page<Players> list(Pageable pageable){
        Page<Players> player = playersService.listAllByPage(pageable);
        return player;
    }
}
