package Piece;

import Main.Board;
import Main.Piece;

public class King extends Piece {
    private King (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'K';
    }
    public static Piece factor(boolean isWhite){
        return new King(isWhite);
    }
    @Override
    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        boolean move = false;
        if (Math.abs(goalX-startX)<2) {
            if (Math.abs(goalY-startY)<2) {
                move = true;
                }
            else {
                move = false;
            }
            }
        return false;
    }
}
