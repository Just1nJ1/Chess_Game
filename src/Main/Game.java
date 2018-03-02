package Main;

import Chessmans.Bishop;

import java.util.ArrayList;

public class Game {
    Cell[][] board = new Cell[8][8];

    public Game (){
        for (int tempY = 1; tempY < 9; tempY ++){
            Cell[] tempAL = new Cell[8];
            for (int tempX = 0; tempX < 8; tempX ++){
                tempAL[tempX] = new Cell ( (char)(tempX+97), tempY );
            }
            board[tempY - 1] = tempAL;
            tempAL = null;
        }

        initialChess ();
    }

    private void initialChess (Cell[][] board){
        boolean isWhite=true;
        int position=board.length-1;
        for(int i=0;i<2;i++){
            for (int j=0;j<8;j++){
                board[][]
            }
        }
    }

    }

    @Override
    public String toString () {
        String str = new String();
        for (Cell[] tempAL : board){
            for (Cell tempC : tempAL){
                str += tempC;
            }
            str += "\n\n";
        }
        return str;
    }

    public void showBoard (){ showBoard ( this.board ); }

    public void showBoard(Cell[][] board) {
        String alphebt[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < 8; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < 8; j++) {
                System.out.print("|" + " " + alphebt[i] + (j + 1) + " ");
            }
            System.out.println("|");
            for (int j = 0; j < 8; j++) {
                if (board[i][j].getChessman() == null) {
                    System.out.print("|" + "    ");
                } else {
                    System.out.print("|" + " " + board[i][j].getChessman() + " ");
                }
            }
            System.out.println("|");
        }
        System.out.print("-----------------------------------------");
    }

}
