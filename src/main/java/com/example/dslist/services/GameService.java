package com.example.dslist.services;

import com.example.dslist.dtos.GameDto;
import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.models.GameModel;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        return gameRepository.findAll().stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        GameModel result = gameRepository.findById(id).get();
        return new GameDto(result);
    }
}
