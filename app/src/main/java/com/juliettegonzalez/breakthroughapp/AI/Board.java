package com.juliettegonzalez.breakthroughapp.AI;

import java.util.ArrayList;

/**
 * Created by juliettegonzalez on 18/12/2016.
 */

public class Board {
    public static final int MAX_LENGHT_BOARD = 8;
    private SquareBoard[][] matrix = new SquareBoard[MAX_LENGHT_BOARD][MAX_LENGHT_BOARD];

    /**
     * Create initial matrix matrix
     * @param player1
     * @param computer
     */
    public Board(Player player1, Player computer){
        for (int i=0; i<2; i++){
            for (int j=0; j<MAX_LENGHT_BOARD; j++){
                matrix[i][j] = new SquareBoard(i, j, computer);
                computer.addPawn(matrix[i][j]);
            }
        }
        for (int i=2; i<(MAX_LENGHT_BOARD-2); i++){
            for (int j=0; j<MAX_LENGHT_BOARD; j++){
                matrix[i][j] = new SquareBoard(i, j, null);
            }
        }
        for (int i=(MAX_LENGHT_BOARD-2); i<MAX_LENGHT_BOARD; i++){
            for (int j=0; j<MAX_LENGHT_BOARD; j++){
                matrix[i][j] = new SquareBoard(i, j, player1);
                player1.addPawn(matrix[i][j]);
            }
        }
    }


    public SquareBoard getSquareAt(int i, int j){
        return matrix[i][j];
    }

    /*public SquareBoard[][] getMatrix() {
        return matrix;
    }*/


    public ArrayList<SquareBoard> matrixToList(){
        ArrayList<SquareBoard> squareBoardList = new ArrayList<>();

        for(int i=0;i<MAX_LENGHT_BOARD;i++){
            for(int j=0;j<MAX_LENGHT_BOARD;j++){
                squareBoardList.add(matrix[i][j]);
            }
        }
        return squareBoardList;
    }

}
