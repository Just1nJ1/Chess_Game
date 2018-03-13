package Piece;

import Main.Board;
import Main.Piece;

public class Pawn extends Piece {
    private Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    public static Piece factor(boolean isWhite){
        return new Pawn(isWhite);
    }
    @Override

    public void move(Piece[][] board, int startX, int startY, int goalX, int goalY) {

    }
}
