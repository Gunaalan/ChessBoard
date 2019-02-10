package com.company.chess.run;

import com.company.chess.models.Board.ChessBoard;
import com.company.chess.models.Board.Color;
import com.company.chess.models.Board.PieceNames;
import com.company.chess.models.Pieces.*;

/**
 * Created by guna on 15/06/18.
 */
public class Utils {

    public static ChessBoard formBoard(String[][] array) {
        ChessBoard chessBoard = new ChessBoard();
        Piece[][] piecesArray = chessBoard.getArr();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color color = Color.NONE;
                // switch statement with int data type
                if (array[i][j].charAt(0) == 'B') {
                    color = Color.BLACK;
                } else if (array[i][j].charAt(0) == 'W') {
                    color = Color.WHITE;
                } else {
                    color = Color.NONE;
                }
                switch (array[i][j].charAt(1)) {
                    case 'R':
                        piecesArray[i][j] = new Rook(color, PieceNames.ROOK);
                        break;
                    case 'H':
                        piecesArray[i][j] = new Horse(color, PieceNames.HORSE);
                        break;
                    case 'B':
                        piecesArray[i][j] = new Bishop(color, PieceNames.BISHOP);
                        break;
                    case 'Q':
                        piecesArray[i][j] = new Queen(color, PieceNames.QUEEN);
                        break;
                    case 'K':
                        piecesArray[i][j] = new King(color, PieceNames.KING);
                        break;
                    case 'P':
                        piecesArray[i][j] = new Pawn(color, PieceNames.PAWN);
                        break;
                    default:
                        piecesArray[i][j] = new EmptyPiece(color, PieceNames.NONE);
                        break;
                }
            }
        }
        chessBoard.setArr(piecesArray);
        return chessBoard;
    }

}
