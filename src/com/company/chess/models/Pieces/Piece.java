package com.company.chess.models.Pieces;

import com.company.chess.models.Board.ChessBoard;
import com.company.chess.models.Board.Color;
import com.company.chess.models.Board.PieceNames;
import lombok.Data;

/**
 * Created by guna on 15/06/18.
 */
@Data
public class Piece {
    Color color;
    PieceNames name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PieceNames getName() {
        return name;
    }

    public void setName(PieceNames name) {
        this.name = name;
    }

    public Piece(Color color, PieceNames pieceNames) {
        this.color = color;
        this.name = pieceNames;
    }

    public Piece() {
    }

    public void move(int source_i, int source_j, int dest_i, int dest_j, ChessBoard chessBoard) throws Exception {
        Piece[][] arr = chessBoard.getArr();
        arr[dest_i][dest_j] = arr[source_i][source_j];
        arr[source_i][source_j] = new EmptyPiece(Color.NONE,PieceNames.NONE);
        chessBoard.setArr(arr);
        return ;
    }

    public boolean moveValidator(int source_i, int source_j, int dest_i, int dest_j,ChessBoard chessBoard) throws Exception {
        if (((0 <= source_i && source_i < 8) && (0 <= source_j && source_j < 8) && (0 <= dest_i && dest_i < 8) && (0 <= dest_j && dest_j < 8)) && !(source_i == dest_i && source_j == dest_j)){
            return true;
        } else {
            throw new Exception();
        }
    }
    }
