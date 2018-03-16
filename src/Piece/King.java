package Piece;

import Exceptions.StopGameException;
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
    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) throws StopGameException {
        boolean move = true;
        if (goalX == startX + 1 || goalX == startX - 1 || goalX == startX) {
            if (goalY == startY + 1 || goalY == startY - 1 || goalY == startY) {
                if (startX == goalX) {
                    if (!(super.checkPath(board, startX, startY, goalX, goalY))) {
                        move = false;
                    }
                    if (move = true) {
                        super.move(board, startX, startY, goalX, goalY);
                    }
                } else if (startY == goalY) {
                    if (!(super.checkPath(board, startX, startY, goalX, goalY))) {
                        move = false;
                    }
                    if (move = true) {
                        super.move(board, startX, startY, goalX, goalY);
                    }
                } else if (!(super.checkPath(board, startX, startY, goalX, goalY))){
                    if (move = true) {
                        super.move(board, startX, startY, goalX, goalY);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void remove() throws StopGameException {
        super.remove ();
        throw new StopGameException ();
    }

}
