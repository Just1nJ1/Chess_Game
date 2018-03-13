package Piece;

import Main.Board;
import Main.Piece;

public class Bishop extends Piece {
    private Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    public static Piece factor(boolean isWhite){
        return new Bishop(isWhite);
    }

    @Override
    public void move(Piece[][] board, int startX, int startY, int goalX, int goalY) {

    }
}
