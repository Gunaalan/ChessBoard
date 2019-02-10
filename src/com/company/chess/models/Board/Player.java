package com.company.chess.models.Board;

import com.company.chess.models.Board.Color;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class Player {
    String name;
    Color color;
    String mobile;

    public Player(String name, Color color, String mobile) {
        this.name = name;
        this.color = color;
        this.mobile = mobile;
    }
}
