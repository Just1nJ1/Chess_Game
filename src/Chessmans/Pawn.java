package Chessmans;

import Main.Board;
import Main.Cell;

public class Pawn extends Main.Chessman {
    public Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
