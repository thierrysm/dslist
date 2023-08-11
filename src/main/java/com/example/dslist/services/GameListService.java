package com.example.dslist.services;

import com.example.dslist.dtos.GameDto;
import com.example.dslist.dtos.GameListDto;
import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.models.GameList;
import com.example.dslist.models.GameModel;
import com.example.dslist.repositories.GameListRepository;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        return gameListRepository.findAll().stream().map(GameListDto::new).toList();
    }
}
