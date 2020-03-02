package yncrea.lab04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import yncrea.lab04.core.entity.Player;

import java.util.List;

public interface PlayerDAO extends JpaRepository<Player, Long> {

    @Query("SELECT DISTINCT c FROM Player c LEFT JOIN FETCH c.teams")
    List<Player> findAllWithTeams();
}
