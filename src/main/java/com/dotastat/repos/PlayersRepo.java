package com.dotastat.repos;

import com.dotastat.entities.Players;
import com.dotastat.entities.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Repository
public interface PlayersRepo  extends PagingAndSortingRepository<Players,String> {
}
