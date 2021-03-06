package Main;

import Exceptions.GameOverException;
import Piece.*;

public abstract class Piece {
    protected boolean isWhite;
    protected char name;
    public boolean isMoved = false;
    private boolean meetDiff = false;


    /**
     * last change: 12:55 Mar 9 By Justin
     * @param board
     * @param startX
     * @param startY
     * @param goalX
     * @param goalY
     */
    public void move (Piece board[][], int startX, int startY, int goalX, int goalY) throws GameOverException {
        if (board[goalY][goalX] != null){ board[goalY][goalX].remove(); }
        board[goalY][goalX] = board[startY][startX];
        board[startY][startX] = null;
        meetDiff = false;
        isMoved = true;
    }

    public static Piece factor(boolean isWhite, int number){
        if (number>4){number=7-number;}
        Piece[] chessmen={Rook.factor(isWhite), Knight.factor(isWhite),Bishop.factor(isWhite),Queen.factor(isWhite),King.factor(isWhite)};
        return chessmen[number];
    }

    /**
     * last change:
     * @param board
     * @param startX
     * @param startY
     * @param goalX
     * @param goalY
     * @return true if it can reach. Otherwise false.
     */
    public boolean checkPath (Piece[][] board, int startX, int startY, int goalX, int goalY){
        if (board[goalY][goalX] == null){
            return true;
        } else if (board[goalY][goalX].isWhite != isWhite && !meetDiff) {
            meetDiff = true;
            return true;
        }

        return false;
    }
    public boolean getIsWhite(){return isWhite;}

    public void remove () throws GameOverException {
        System.out.println ( this + " is removed." );
    }

    /**
     * last change:
     * @return Piece color and name.
     */
    @Override
    public String toString() {
        return (isWhite ? "W" : "B") + name;
    }
}