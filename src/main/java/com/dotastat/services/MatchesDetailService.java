package com.dotastat.services;

import com.dotastat.entities.Matchstat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by sinichiKuda on 5/10/2017.
 */
@Service
public interface MatchesDetailService {
    Page<Matchstat> getAll(Pageable pageable);
}
