package yncrea.lab04.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab04.core.dao.PlayerDAO;
import yncrea.lab04.core.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
@Transactional
public class TeamService {

    private PlayerDAO companyDAO;


    public TeamService(final PlayerDAO companyDAO) {
        this.companyDAO = companyDAO;
    }


    public void deleteAll() {
        companyDAO.deleteAll();
    }


    public void save(final Player company) {
        companyDAO.save(company);
    }


    public long countAll() {
        return companyDAO.count();
    }


    public Map<String, Integer> getAllWithProjectCount() {
        Map<String,Integer> projectCount = new TreeMap<>();
        final List<Player> companies = companyDAO.findAllWithProjects();
        for(Player company:companies){
            projectCount.put(company.getName(),company.getProjects().size());
        }
        return projectCount;
    }

    public List<Player> findAllWithProjects(){
        return companyDAO.findAllWithProjects();
    }


    public void deleteById(final long id) {
        companyDAO.deleteById(id);
    }
}
