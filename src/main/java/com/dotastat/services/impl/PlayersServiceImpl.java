package com.dotastat.services.impl;

import com.dotastat.entities.Players;
import com.dotastat.repos.PlayersRepo;
import com.dotastat.services.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Service
public class PlayersServiceImpl implements PlayersService {
    @Autowired
    private PlayersRepo playersRepo;
    @Override
    public Page<Players> listAllByPage(Pageable pageable) {
        return playersRepo.findAll(pageable);
    }
}
