package Piece;

import Main.Board;
import Main.Piece;

public class King extends Piece {
    public King (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'K';
    }

    @Override
    public boolean move(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
