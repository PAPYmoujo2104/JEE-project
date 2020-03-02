package yncrea.lab04.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab04.core.dao.MatchDAO;
import yncrea.lab04.core.dao.RegionDAO;
import yncrea.lab04.core.entity.Region;

import java.util.List;

@Service
@Transactional
public class MatchService {

    private MatchDAO matchDAO;


    public MatchService(final MatchDAO) {
        this.MatchDAO = MatchDAO;
    }


    public void deleteAll() {
        MatchDAO.deleteAll();
    }


    public void save(Region project) {
        MatchDAO.save(project);
    }


    public long countAll() {
        return MatchDAO.count();
    }


    public List<Region> findAll() {
        return MatchDAO.findAll();
    }
}
