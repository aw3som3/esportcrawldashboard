/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.services.impl;

import com.dotastat.entities.MatchChart;
import com.dotastat.entities.Matches;
import com.dotastat.repos.MatchesRepo;
import com.dotastat.services.MatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sinichiKuda
 */
@Service
public class MatchesServiceImpl implements MatchesService {

    @Autowired 
    private MatchesRepo matchesRepo;
    
    @Override
    public Page<Matches> listAllByPage(Pageable pageable) {
        return matchesRepo.findAll(pageable);
    }

    @Override
    public List<MatchChart> getMatchCount() {
        List<Object[]> a =  matchesRepo.findMatchCount();

        List<MatchChart> lmc = new ArrayList<>();

        for(int i=0;i<a.size();i++){
            MatchChart mc = new MatchChart();
            mc.setCount1(((BigInteger) a.get(i)[0]).intValue());
            mc.setDate1((Date) a.get(i)[1]);
            lmc.add(mc);
        }
        return lmc;
    }
}
