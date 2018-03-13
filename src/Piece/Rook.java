package Piece;

import Main.Board;
import Main.Piece;

public class Rook extends Piece {
    public Rook (boolean isWhite) {
        super.isWhite = isWhite;
        super.name = 'R';
    }

    @Override
    public boolean checkPath(Piece board[][], int startX, int startY, int goalX, int goalY) {
        boolean flag = true;
        if(startX == goalX){
            for(int i=0; i<=(goalX); i++){
                if(!(checkPath(board,startX,startY,goalX,goalY))){
                    return false;
                }
            }
            super.move(board,startX,startY,goalX,goalY);
        }
        else if(startY == goalY){
            for(int i=0; i<=(goalY); i++){
                if(!(checkPath(board,startX,startY,goalX,goalY))){
                    return false;
                }
            }
            super.move(board,startX,startY,goalX,goalY);
        }
        return false;
    }
}
