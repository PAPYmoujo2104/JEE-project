package yncrea.lab04.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab04.core.dao.TeamDAO;
import yncrea.lab04.core.entity.Team;

@Service
@Transactional
public class RegionService {

    private TeamDAO customerDAO;


    public RegionService(final TeamDAO customerDAO) {
        this.customerDAO = customerDAO;
    }


    public void deleteAll() {
       customerDAO.deleteAll();
    }


    public void save(Team customer) {
        customerDAO.save(customer);
    }


    public long countAll() {
       return customerDAO.count();
    }
}
