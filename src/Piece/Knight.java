package Piece;

import Main.Board;
import Main.Piece;

public class Knight extends Piece {
    private Knight (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'N';
    }
    public static Piece factor(boolean isWhite){
        return new Knight(isWhite);
    }

    @Override
    public boolean checkPath (Piece[][] board, int startX, int startY, int goalX, int goalY){
        int dX = Math.abs ( goalX - startX );
        int dY = Math.abs ( goalY - startY );
        if (dX + dY != 3 || dX * dY != 2){ return false; }
        else { return super.checkPath ( board, startX, startY, goalX, goalY ); }
    }
}
