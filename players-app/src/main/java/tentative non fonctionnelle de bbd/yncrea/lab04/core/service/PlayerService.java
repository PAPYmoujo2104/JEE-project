package yncrea.lab04.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab04.core.dao.MatchDAO;
import yncrea.lab04.core.entity.Match;

@Service
@Transactional
public class PlayerService {

    private MatchDAO businessTypeDAO;


    public PlayerService(final MatchDAO businessTypeDAO) {
        this.businessTypeDAO = businessTypeDAO;
    }


    public void deleteAll() {
        businessTypeDAO.deleteAll();
    }


    public void save(final Match businessType) {
        businessTypeDAO.save(businessType);
    }


    public long countAll() {
       return businessTypeDAO.count();
    }
}
