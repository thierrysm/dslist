package com.example.dslist.services;

import com.example.dslist.dtos.GameDto;
import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.models.GameModel;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        return gameRepository.findAll().stream().map(x -> new GameMinDto(x)).toList();
    }

    public GameDto findById(Long id) {
        GameModel result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
}
