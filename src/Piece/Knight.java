package Piece;

import Main.Board;
import Main.piece;

public class Knight extends piece {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
