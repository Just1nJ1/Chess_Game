package Chessmans;

import Main.Cell;

public class Queen extends Main.Chessman {
    public Queen (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'Q';
    }

    @Override
    public boolean move(Cell currentCell, Cell goalCell) {
        return false;
    }
}
