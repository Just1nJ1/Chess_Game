package Chessmans;

import Main.Cell;

public class King extends Main.Chessman {
    public King (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'K';
    }

    @Override
    public boolean move(Cell currentCell, Cell goalCell) {
        return false;
    }
}
