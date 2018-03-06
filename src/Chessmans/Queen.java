package Chessmans;

import Main.Board;
import Main.Cell;

public class Queen extends Main.Chessman {
    public Queen (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'Q';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
