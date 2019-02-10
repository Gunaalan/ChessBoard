//package com.company.chess.run;
//
//import com.company.chess.models.Board.ChessBoard;
//import com.company.chess.models.Pieces.Piece;
//import org.apache.commons.codec.binary.StringUtils;
//
///**
// * Created by guna on 15/06/18.
// */
//public class Helper {
//    public void analyseMovesAndPrintBoard(int[][] moves, int row, ChessBoard chessBoard) {
//        Piece[][] arr = chessBoard.getArr();
//        for (int i = 0; i < row; i++) {
//            System.out.println("\nMove number -> " + (i + 1));
//            try {
//                if (arr[moves[i][0] / 10][moves[i][0] % 10].moveValidator(moves[i][0] / 10, moves[i][0] % 10, moves[i][1] / 10, moves[i][1] % 10, chessBoard)) {
//                    arr[moves[i][0] / 10][moves[i][0] % 10].move(moves[i][0] / 10, moves[i][0] % 10, moves[i][1] / 10, moves[i][1] % 10, chessBoard);
//                    System.out.println(moves[i][0] + "#Move Successful# " + moves[i][1]);
//                    printBoard(chessBoard);
//                } else {
//                    System.out.println(moves[i][0] + "#Invalid move#" + moves[i][1]);
//                    printBoard(chessBoard);
//                }
//            } catch (Exception e) {
//                //System.out.println(e);
//                System.out.println(moves[i][0] + "#Invalid move#" + moves[i][1]);
//                printBoard(chessBoard);
//            }
//        }
//    }
//
//    public void printBoard(ChessBoard chessBoard) {
//        System.out.println("Board printed \n");
//        Piece[][] arr = chessBoard.getArr();
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print(new StringBuilder().append(arr[i][j].getColor().toString().charAt(0)).append(arr[i][j].getName().toString().charAt(0)).append(" "));
//            }
//            System.out.print("\n");
//        }
//    }
//}
//
