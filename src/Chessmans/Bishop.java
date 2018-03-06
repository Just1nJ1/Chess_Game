package Chessmans;

import Main.Board;
import Main.Cell;

public class Bishop extends Main.Chessman {
    public Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
