package Piece;

import Main.Board;
import Main.Piece;

public class Queen extends Piece {
    public Queen (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'Q';
    }

    @Override
    public boolean move(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        return false;
    }
}
