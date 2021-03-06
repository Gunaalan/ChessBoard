package com.company.chess.models.Pieces;

import com.company.chess.models.Board.ChessBoard;
import com.company.chess.models.Board.Color;
import com.company.chess.models.Board.PieceNames;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class Bishop extends Piece {
    public Bishop(Color color, PieceNames pieceNames) {
        super(color,pieceNames);
    }

    @Override
    public boolean moveValidator(int source_i, int source_j, int dest_i, int dest_j, ChessBoard chessBoard) throws Exception {
        if (super.moveValidator(source_i, source_j, dest_i, dest_j, chessBoard)) {
            if ((Math.abs(source_i - dest_i) / Math.abs(source_j - dest_j) == 1)) {
                Piece[][] arr = chessBoard.getArr();

                int iter_i = source_i, iter_j = source_j;
                if (source_i < dest_i && source_j < dest_j) {
                    while (iter_i < dest_i && iter_j < dest_j) {
                        if (!(arr[++iter_i][++iter_j] instanceof EmptyPiece)) {
                            throw new Exception();
                        }
                        //++iter_i;
                        //++iter_j;
                    }
                    return true;
                } else if (source_i < dest_i && source_j > dest_j) {
                    while (iter_i < dest_i && iter_j > dest_j) {
                        if (!(arr[++iter_i][--iter_j] instanceof EmptyPiece)) {
                            throw new Exception();
                        }
                        //++iter_i;
                        //--iter_j;
                    }
                    return true;
                } else if (source_i > dest_i && source_j < dest_j) {
                    while (iter_i > dest_i && iter_j < dest_j) {
                        if (!(arr[ --iter_i][++iter_j] instanceof EmptyPiece)) {
                            throw new Exception();
                        }
                        //--iter_i;
                        //++iter_j;
                    }
                    return true;
                } else if (source_i > dest_i && source_j > dest_j) {
                    while (iter_i > dest_i && iter_j > dest_j) {
                        if (!(arr[--iter_i][--iter_j] instanceof EmptyPiece)) {
                            throw new Exception();
                        }
                        //--iter_i;
                        //--iter_j;
                    }
                    return true;
                } else {
                    return false;
                }

            }
            return false;
        }
        return false;
    }

}
