package Chessmans;

import Main.Board;
import Main.Cell;

public class Knight extends Main.Chessman {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
