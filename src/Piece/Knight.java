package Piece;

import Main.Board;
import Main.Piece;

public class Knight extends Piece {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
