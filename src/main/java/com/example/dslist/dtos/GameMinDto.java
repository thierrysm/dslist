package com.example.dslist.dtos;

import com.example.dslist.models.GameModel;
import lombok.Data;

@Data
public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(GameModel gameModel) {
        this.id = gameModel.getId();
        this.title = gameModel.getTitle();
        this.year = gameModel.getYear();
        this.imgUrl = gameModel.getImgUrl();
        this.shortDescription = gameModel.getShortDescription();
    }
}


