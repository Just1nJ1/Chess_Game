package Piece;

import Exceptions.GameOverException;
import Main.Board;
import Main.Game;
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
        if (Math.abs(goalX-startX)<2 && Math.abs(goalY-startY)<2) {
            return super.checkPath ( board, startX, startY, goalX, goalY );
        } else if (startY == goalY && !isMoved && Math.abs ( goalX - startX ) == 2){
            int dir = (goalX - startX) / Math.abs ( goalX - startX );
            int i = startX + dir;
            for (; i != 0 && i != 7; i += dir){
                if (null != board[startY][i]){
                    return false;
                }
            }
            if (board[startY][i].isMoved){
                return false;
            }
            try {
                super.move ( board, i, startY, startX + dir , goalY );
            } catch (GameOverException e){}
            return true;
        }
        return false;
    }

    @Override
    public void remove () throws GameOverException {
        super.remove ();
        throw new GameOverException ( "Game is Over." );
    }
}
