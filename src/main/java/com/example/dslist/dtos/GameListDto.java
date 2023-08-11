package com.example.dslist.dtos;

import com.example.dslist.models.GameList;
import lombok.Data;

@Data
public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(GameList gameList) {
        id = gameList.getId();
        name = gameList.getName();
    }
}
