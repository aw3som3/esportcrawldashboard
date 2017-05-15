package com.dotastat.services;

import com.dotastat.entities.ActiveTeams;
import com.dotastat.entities.Matches;
import com.dotastat.entities.Teams;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Service
public interface TeamService {
    List<Teams> listAllByPage();

    List<ActiveTeams> activeTeams();
}
