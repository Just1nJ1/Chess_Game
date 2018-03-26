package Piece;

import Main.Board;
import Main.Piece;

public class Bishop extends Piece {
    private Bishop (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'B';
    }

    public static Piece factor(boolean isWhite){
        return new Bishop(isWhite);
    }

    @Override
    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        if(Math.abs(startX-goalX)==Math.abs(startY-goalY)){
            int dirX = (goalX-startX) / Math.abs(goalX-startX);
            int dirY = (goalY-startY) / Math.abs(goalY-startY);
            for(int i=1; i!=Math.abs(goalX-startX)+1; i+=1){
                if (!(super.checkPath(board, startX, startY, startX + (i * dirX), startY + (i * dirY)))) {
                    return false;
                }
            }
            return true;
            }
        return false;
    }
}
