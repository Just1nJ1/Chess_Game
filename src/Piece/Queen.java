package Piece;

import Main.Board;
import Main.Piece;

public class Queen extends Piece {
    private Queen (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'Q';
    }

    public static Piece factor(boolean isWhite){
        return new Queen(isWhite);
    }

    @Override
    public boolean checkPath (Piece[][] board, int startX, int startY, int goalX, int goalY) {
        if (Bishop.factor ( isWhite ).checkPath ( board, startX, startY, goalX, goalY ) || Rook.factor ( isWhite ).checkPath ( board, startX, startY, goalX, goalY )){ return true; }
        return false;
    }
}
