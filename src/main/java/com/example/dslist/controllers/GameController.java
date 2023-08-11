package com.example.dslist.controllers;

import com.example.dslist.dtos.GameDto;
import com.example.dslist.dtos.GameMinDto;
import com.example.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    ResponseEntity<List<GameMinDto>> findAll() {
        var list = gameService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<GameDto> findById(@PathVariable Long id) {
        var GameDto = gameService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(GameDto);
    }
}
