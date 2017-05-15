package com.dotastat.repos;

import com.dotastat.entities.Matchstat;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sinichiKuda on 5/10/2017.
 */
@Repository
public interface MatchesDetailRepo extends PagingAndSortingRepository<Matchstat,String> {

}
