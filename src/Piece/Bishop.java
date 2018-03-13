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
    public void move(Piece[][] board, int startX, int startY, int goalX, int goalY) {}

    public boolean checkPath(Piece[][] board, int startX, int startY, int goalX, int goalY) {
        if(Math.abs(startX-goalX)==Math.abs(startY-goalY)){
            int dirX = 0;
            int dirY = 0;
            if(goalX-startX>0){
                dirX=1;
            }
            if(goalX-startX<0){
                dirX=-1;
            }
            if(goalY-startY>0){
                dirY=1;
            }
            if(goalY-startY<0){
                dirY=-1;
            }
            if(goalX-startX==goalY-startY){
                for(int i=0;i<=goalX;i++){
                    i=i*dirX*dirY;
                    if(!(super.checkPath(board, startX, startY, startX+i, startY+i))){
                        return false;
                    }
                    if(i==goalX){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
