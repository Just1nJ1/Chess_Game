package Piece;

import Main.Board;
import Main.Piece;

public class Rook extends Piece {
    public Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    @Override
    public boolean move(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
