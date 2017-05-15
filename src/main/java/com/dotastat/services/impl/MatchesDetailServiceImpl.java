package com.dotastat.services.impl;

import com.dotastat.entities.Matchstat;
import com.dotastat.repos.MatchesDetailRepo;
import com.dotastat.services.MatchesDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by sinichiKuda on 5/10/2017.
 */
@Service
public class MatchesDetailServiceImpl implements MatchesDetailService {
    @Autowired
    private MatchesDetailRepo matchesDetailRepo;

    @Override
    public Page<Matchstat> getAll(Pageable pageable){
        return matchesDetailRepo.findAll(pageable);
    }

}
