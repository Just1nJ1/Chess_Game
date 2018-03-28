package Piece;

import Main.Board;
import Main.Piece;

public class Pawn extends Piece {
    public Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    public static Piece factor(boolean isWhite){
        return new Pawn(isWhite);
    }

    @Override
    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        int sign = isWhite ? -1 : 1;
        if ((goalY - startY) * sign <= 0) { return false; }
        if ( startX == goalX ) {
            if ((goalY - startY) * sign > 2){ return false; }
            if ((goalY - startY) * sign > 1){ return !isMoved && board[startY + sign][startX] == null && board[goalY][startX] == null; }
            if ((goalY - startY) * sign > 0){
                return board[startY + sign][startX] == null && board[goalY][startX] == null;
            }
            return false;

        } else if (Math.abs ( startX - goalX ) > 1) { return false; }
        else if (board[goalY][goalX] == null){ return false; }
        return true;

    }
}
