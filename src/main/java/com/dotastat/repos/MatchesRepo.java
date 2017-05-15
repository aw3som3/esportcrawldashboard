/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotastat.repos;

import com.dotastat.entities.MatchChart;
import com.dotastat.entities.Matches;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author sinichiKuda
 */
@Repository
public interface MatchesRepo extends PagingAndSortingRepository<Matches,String> {

    @Query(value="SELECT COUNT(*) as count1,date1 FROM (select DATE(dtMatch) as date1 from matches) A GROUP BY date1 ORDER BY date1", nativeQuery = true)
    public List<Object[]> findMatchCount();
}
