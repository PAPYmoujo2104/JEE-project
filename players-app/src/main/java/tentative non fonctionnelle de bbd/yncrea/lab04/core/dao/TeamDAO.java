package yncrea.lab04.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yncrea.lab04.core.entity.Team;

public interface TeamDAO extends JpaRepository<Team, Long> {

}
