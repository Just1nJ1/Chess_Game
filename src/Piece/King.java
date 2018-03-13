package Piece;

import Main.Board;
import Main.Piece;

public class King extends Piece {
    private King (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'K';
    }
    public static Piece factor(boolean isWhite){
        return new King(isWhite);
    }
    @Override

    public void move(Piece[][] board, int startX, int startY, int goalX, int goalY) {

    }
}
