package com.example.players;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PlayerService {

    List<Player> playerList = PlayerList.getInstance();

    public List<Player> getAllPlayers() {
        return playerList;
    }

    public List<Player> searchPlayers(String search) {
        Comparator<Player> groupByComparator = Comparator.comparing(Player::getName)
                                                    .thenComparing(Player::getLastName)
                                                    .thenComparing(Player::getPseudo)
                                                    .thenComparing(Player::getNationality)
                                                    .thenComparing(Player::getTeam);
        return playerList
                .stream()
                .filter(e -> e.getName().equalsIgnoreCase(search) || e.getLastName().equalsIgnoreCase(search) || e.getPseudo().equalsIgnoreCase(search) || e.getNationality().equalsIgnoreCase(search) || e.getTeam().equalsIgnoreCase(search))
                .sorted(groupByComparator)
                .collect(Collectors.toList());
    }

    public Player getPlayer(long id) throws Exception {
        Optional<Player> match
                = playerList.stream()
                .filter(e -> e.getId() == id)
                .findFirst();
        if (match.isPresent()) {
            return match.get();
        } else {
            throw new Exception("The Player id " + id + " not found");
        }
    }   

    public long addPlayer(Player player) {
        playerList.add(player);
        return player.getId();
    }

    public boolean updatePlayer(Player customer) {
        int matchIdx = 0;
        Optional<Player> match = playerList.stream()
                .filter(c -> c.getId() == customer.getId())
                .findFirst();
        if (match.isPresent()) {
            matchIdx = playerList.indexOf(match.get());
            playerList.set(matchIdx, customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean deletePlayer(long id) {
        Predicate<Player> player = e -> e.getId() == id;
        if (playerList.removeIf(player)) {
            return true;
        } else {
            return false;
        }
    }
}
