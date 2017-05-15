/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.rest;

import com.dotastat.entities.MatchChart;
import com.dotastat.entities.Matches;
import com.dotastat.services.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author sinichiKuda
 */

@RestController
public class MatchesRest {
    @Autowired
    private MatchesService matchesService;
    @RequestMapping(value="/matches",method=RequestMethod.GET)
    Page<Matches> list(Pageable pageable){
            Page<Matches> matches = matchesService.listAllByPage(pageable);
            return matches;
    }

    @RequestMapping(value="/matchescount",method=RequestMethod.GET)
    List<MatchChart> list(){
        List<MatchChart> matches = matchesService.getMatchCount();
        return matches;
    }
}
