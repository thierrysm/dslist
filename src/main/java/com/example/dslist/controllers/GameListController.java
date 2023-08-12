package com.example.dslist.controllers;

import com.example.dslist.dtos.GameListDto;
import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.services.GameListService;
import com.example.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @RequestMapping
    ResponseEntity<List<GameListDto>> findAll() {
        var list = gameListService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @RequestMapping(value = "/{listId}/games")
    ResponseEntity<List<GameMinDto>> findByGameList(@PathVariable Long listId) {
        List<GameMinDto> list = gameService.findByGameList(listId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
}
