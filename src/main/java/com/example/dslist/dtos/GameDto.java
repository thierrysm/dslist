package com.example.dslist.dtos;

import com.example.dslist.models.GameModel;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDto {

        private Long id;
        private String title;
        private Integer year;
        private String genre;
        private String platforms;
        private Double score;
        private String imgUrl;
        private String shortDescription;
        private String longDescription;

        public GameDto(GameModel gameModel) {
            BeanUtils.copyProperties(gameModel, this);
        }
}
