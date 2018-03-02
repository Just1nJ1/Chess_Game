package Chessmans;

import Main.Cell;

public class Rook extends Main.Chessman {
    public Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    @Override
    public boolean move(Cell currentCell, Cell goalCell) {
        return false;
    }
}
