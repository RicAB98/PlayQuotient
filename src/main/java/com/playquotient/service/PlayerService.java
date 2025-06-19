package com.playquotient.service;

import com.playquotient.model.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    public List<Player> getAllPlayers() {
        return List.of(
                new Player(1L, "Carlos Alcaraz", "Spain"),
                new Player(2L, "Jannik Sinner", "Italy"),
                new Player(3L, "Novak Djokovic", "Serbia")
        );
    }

    public Player getPlayerById(Long id) {
        return getAllPlayers()
                .stream()
                .filter(player -> player.getId().equals(id))
                .findFirst()
                .orElse(null); // We’ll improve this with proper error handling later
    }
}
