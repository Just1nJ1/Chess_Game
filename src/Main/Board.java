package Main;

import Chessmans.*;

public class Board {
    Chessman[][] board;

    private Board() {
        board = new Chessman[8][8];
    }



    public static Board factor(){
        Board board=new Board();
        boolean isWhite=false;
        for(int hor=1,i=0;i<2;i++){
            for (int ver=0;ver<8;ver++){
                board.board[hor][ver]=new Pawn(isWhite);
            }
            if(isWhite){hor+=1;}
            else{hor-=1;}
            for (int ver=0;ver<8;ver++){
                board.board[hor][ver]=createChess(isWhite,ver);
            }
            isWhite=true;
            hor=6;
        }
        return board;
    }

    private static Chessman createChess(boolean isWhite, int number){
        if (number>4){number=7-number;}
        Chessman[] chessmen={new Rook(isWhite),new Knight(isWhite),new Bishop(isWhite),new Queen(isWhite),new King(isWhite)};
        return chessmen[number];
    }


    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < 8; i++) {
            str+="\n"+(8-i);
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    str+= "[ "+board[i][j]+" ]";
                } else {
                    str+= "[    ]";
                }
            }
            str += "\n";

        }
        str += "    a     b     c     d     e     f     g     h";
        return str;
    }
}
