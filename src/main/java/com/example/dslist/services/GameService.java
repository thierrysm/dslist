package com.example.dslist.services;

import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<GameMinDto> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDto(x)).toList();
    }
}
