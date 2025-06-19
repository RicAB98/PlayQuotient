package com.playquotient.controller;

import com.playquotient.model.Match;
import com.playquotient.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/{playerId}")
    public List<Match> getMatches(@RequestParam(required = false) Long playerId) {
        if (playerId != null) {
            return matchService.getMatchesByPlayerId(playerId);
        }
        return matchService.getAllMatches();
    }
}