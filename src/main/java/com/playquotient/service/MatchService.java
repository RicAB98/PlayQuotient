package com.playquotient.service;

import com.playquotient.model.Match;
import com.playquotient.model.Player;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    public List<Match> getAllMatches() {
        Player alcaraz = new Player(1L, "Carlos Alcaraz", "Spain");
        Player sinner = new Player(2L, "Jannik Sinner", "Italy");

        Match match = new Match(
                1L,
                alcaraz,
                sinner,
                "Carlos Alcaraz"
        );

        return List.of(match);
    }

    public List<Match> getMatchesByPlayerId(Long playerId) {
        return getAllMatches().stream()
                              .filter(match -> match.getPlayer1().getId().equals(playerId)
                                      || match.getPlayer2().getId().equals(playerId))
                              .collect(Collectors.toList());
    }
}
