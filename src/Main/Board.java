package Main;

import Piece.*;

public class Board {
    Piece[][] board;

    private Board() {
        board = new Piece[8][8];
    }
    public Piece[][] getBoard(){
        return board;
    }


    public static Board factor(){
        Board board=new Board();
        boolean isWhite=false;
        for(int hor=1,i=0;i<2;i++){
            for (int ver=0;ver<8;ver++){
                board.board[hor][ver]=Pawn.factor(isWhite);
            }
            if(isWhite){hor+=1;}
            else{hor-=1;}
            for (int ver=0;ver<8;ver++){
                board.board[hor][ver]=Piece.factor(isWhite,ver);
            }
            isWhite=true;
            hor=6;
        }
        return board;
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
