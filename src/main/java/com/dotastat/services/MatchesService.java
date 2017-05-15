/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.services;

import com.dotastat.entities.MatchChart;
import com.dotastat.entities.Matches;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author sinichiKuda
 */
@Service
public interface MatchesService {
    Page<Matches> listAllByPage(Pageable pageable);

    List<MatchChart> getMatchCount();
}
