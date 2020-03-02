package yncrea.lab04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab04.core.entity.Match;

public interface MatchDAO extends JpaRepository<Match, Long> {

}
