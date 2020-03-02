package com.example.players;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MatchService {

    static List<Match> matchList = MatchList.getInstance();

    public List<Match> getAllMatches() {
        return matchList;
    }


}
