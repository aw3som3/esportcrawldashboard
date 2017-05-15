package com.dotastat.repos;

import com.dotastat.entities.Matches;
import com.dotastat.entities.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Repository
public interface TeamsRepo extends JpaRepository<Teams,String> {

    @Query(value="SELECT teamid,teamname,COUNT(*) as count1 FROM  (SELECT teams.name as teamname, teams.id as teamid,A.id as matchid FROM teams INNER JOIN matches A ON teams.id = A.teamid1 UNION SELECT teams.name as teamname, teams.id as teamid,A.id as matchid FROM teams INNER JOIN matches A ON teams.id = A.teamid2) C GROUP BY teamid ORDER BY count1 DESC LIMIT 0,5", nativeQuery = true)
    public List<Object[]> getActiveTeams();
}
