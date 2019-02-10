package com.company.chess.models.Board;

import com.company.chess.models.Pieces.EmptyPiece;
import com.company.chess.models.Pieces.Piece;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class ChessBoard {
    Piece[][] arr = new Piece[8][8];
    public Piece[][] getArr() {
        return arr;
    }

    public void setArr(Piece[][] arr) {
        this.arr = arr;
    }

    public ChessBoard(Piece[][] arr) {
        this.arr = arr;
    }

    public ChessBoard() {
        for(int i=0; i < 8;i++) {
            for(int j=0;j<8;j++) {
                this.arr[i][j] = new EmptyPiece(Color.NONE,PieceNames.NONE);
            }
        }
    }
}
