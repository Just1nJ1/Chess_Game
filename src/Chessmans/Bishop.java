package Chessmans;

import Main.Cell;

public class Bishop extends Main.Chessman {
    public Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    @Override
    public boolean move(Cell currentCell, Cell goalCell) {
        return false;
    }
}
