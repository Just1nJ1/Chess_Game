package Piece;

import Main.Board;
import Main.Piece;

public class Pawn extends Piece {
    public Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
