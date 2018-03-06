package Piece;

import Main.Board;
import Main.Piece;

public class Knight extends Piece {
    public Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }

    @Override
    public boolean move(Board board, int startX, int startY, int goalX, int goalY) {
        int dX = Math.abs ( startX - goalX );
        int dY = Math.abs ( startY - goalY );
        if ( dX + dY != 3 || dX * dY != 2 && !checkPath ( board, startX, startY, goalX, goalY ) ){ return false; }
        super.move ( board, startX, startY, goalX, goalY );
        return true;
    }
}
