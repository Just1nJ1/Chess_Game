package Piece;

import Main.Board;
import Main.Piece;

import java.rmi.MarshalException;

public class Pawn extends Piece {
    public Pawn (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'P';
    }

    @Override
    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        int sign = isWhite ? 1 : -1;
        if ( startX == goalX ) {
            if ((startY - goalY) * sign > 1){
                return !isMoved;
            }
        } else if (Math.abs ( startX - goalX ) > 1) { return false; }
        else if ((startY - goalY) * sign > 1) { return false; }
        return true;

    }
}
