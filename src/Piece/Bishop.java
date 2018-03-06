package Piece;

import Main.Board;
import Main.Piece;

public class Bishop extends Piece {
    public Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    @Override
    public boolean move(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
