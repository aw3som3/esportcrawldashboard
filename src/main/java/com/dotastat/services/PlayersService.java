package com.dotastat.services;

import com.dotastat.entities.Players;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Service
public interface PlayersService {
    Page<Players> listAllByPage(Pageable pageable);
}
