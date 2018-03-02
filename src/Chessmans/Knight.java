package Chessmans;

import Main.Cell;

public class Knight extends Main.Chessman {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(Cell currentCell, Cell goalCell) {
        return false;
    }
}
