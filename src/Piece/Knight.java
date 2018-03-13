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

    public void move(Piece[][] board, int startX, int startY, int goalX, int goalY) {

    }
}
