package com.company.chess.models.Pieces;

import com.company.chess.models.Board.ChessBoard;
import com.company.chess.models.Board.Color;
import com.company.chess.models.Board.PieceNames;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class King extends Piece{
    public King(Color color, PieceNames pieceNames) {
        super(color,pieceNames);
    }

    @Override
    public boolean moveValidator(int source_i, int source_j, int dest_i, int dest_j, ChessBoard chessBoard) throws Exception {
        if (super.moveValidator(source_i, source_j, dest_i, dest_j, chessBoard)) {
            if (((Math.abs(source_i - dest_i) / Math.abs(source_j - dest_j) == 1) || (source_i == dest_i || source_j == dest_j)) && Math.abs(source_i - source_j) <=1 && Math.abs(dest_i - dest_j) <= 1) {
                Piece[][] arr = chessBoard.getArr();

                if(!(arr[dest_i][dest_j] instanceof EmptyPiece)) {
                    throw new Exception();
                }
                return true;

            }
            return false;
        }
        return false;
    }
}
