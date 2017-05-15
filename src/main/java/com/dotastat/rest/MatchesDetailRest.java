package com.dotastat.rest;

import com.dotastat.entities.Matchstat;
import com.dotastat.services.MatchesDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sinichiKuda on 5/10/2017.
 */
@RestController
public class MatchesDetailRest {

    @Autowired
    private MatchesDetailService matchesDetailService;

    @RequestMapping("/matchdetail")
    public Page<Matchstat> getall(Pageable pageable){
        return matchesDetailService.getAll(pageable);
    }
}
