package com.company.chess.models.Pieces;

import com.company.chess.models.Board.Color;
import com.company.chess.models.Board.PieceNames;
import com.company.chess.models.Pieces.Piece;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class EmptyPiece extends Piece {
    public EmptyPiece(Color color, PieceNames pieceNames) {
        super(color,pieceNames);
    }
}
