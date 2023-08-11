package com.example.dslist.controllers;

import com.example.dslist.models.GameList;
import com.example.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListRepository gameListRepository;

    @RequestMapping
    ResponseEntity<List<GameList>> findAll() {
        var list = gameListRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
