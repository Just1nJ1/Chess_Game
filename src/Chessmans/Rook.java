package Chessmans;

import Main.Board;
import Main.Cell;

public class Rook extends Main.Chessman {
    public Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
